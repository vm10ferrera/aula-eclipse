package internalframe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FormCadAgenda extends JDialog{

//ser�o criados os componentes JLabel, JTEXT, e JButton do formul�rio
private JLabel labelNome = new JLabel("Nome:");;
private JLabel labelTelefone = new JLabel("Telefone:");;
private JLabel labelEmail = new JLabel("Email:");
private JLabel labelEndereco = new JLabel("Endereco:");

private JTextField textNome = new JTextField();
private JTextField textTelefone = new JTextField();
private JTextField textEmail = new JTextField();
private JTextField textEndereco = new JTextField();

private JButton buttonGravar;
private JButton buttonFechar;

private InterfaceAgenda pai;

private String codigo = "";

private boolean edicao = false; /*vari�vel de teste que ser� entendita mais � frente*/
public FormCadAgenda(InterfaceAgenda newPai){
this.pai = newPai;
}
//M�todo construtor
public FormCadAgenda(InterfaceAgenda newPai, String codigo, String nome, String telefone,
String email, String endereco){
this(newPai);
this.edicao = true;
this.codigo = codigo;
this.textNome.setText(nome);
this.textTelefone.setText(telefone);
this.textEmail.setText(email);
this.textEndereco.setText(endereco);
}

void inicia(){ //este m�todo � respons�vel por mostrar o formul�rio na agenda

this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //oculta a janela ao fechar
buttonGravar = new JButton("Gravar");
buttonFechar = new JButton("Fechar");

Container pane = this.getContentPane(); //cria Pane (container)

//neste exemplo o layout � nulo ent�o a disposi��o
//dos componentes � definida atraves da propriedade setBounds
pane.setLayout(null);

//define posi��o do formul�rio(x,y) e altura e largura de cada component.
labelNome.setBounds(10, 10, 50, 20);
labelTelefone.setBounds(10, 41, 80, 20);
labelEmail.setBounds(10, 72, 50, 20);
labelEndereco.setBounds(10, 102, 80, 20);

textNome.setBounds(70, 10, 150, 20);
textTelefone.setBounds(70, 41, 70, 20);
textEmail.setBounds(70, 72, 150, 20);
textEndereco.setBounds(70, 102, 150, 20);

buttonGravar.setBounds(68, 140, 80, 22);
buttonFechar.setBounds(150, 140, 80, 22);

//este m�todo define a��o do botao gravar
buttonGravar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
buttonGravarActionPerformed(e);//ao clicar, chama este m�todo
}
});
//a mesma coisa do m�todo anterior
buttonFechar.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
buttonFecharActionPerformed(e);
}
});
// iremos adicionar os compenentes no container
pane.add(labelNome);
pane.add(labelTelefone);
pane.add(labelEmail);
pane.add(labelEndereco);

pane.add(textNome);
pane.add(textTelefone);
pane.add(textEmail);
pane.add(textEndereco);

pane.add(buttonGravar);
pane.add(buttonFechar);


this.setBounds(40, 60, 250, 210); //seta o posicionamento
this.setContentPane(pane);
this.setVisible(true);
}
//definindo o evento do Bot�o Gravar
private void buttonGravarActionPerformed(ActionEvent e){
int resposta;
/*verifica se j� � um arquivo novo pra inclus�o ou apenas edi��o e um j� cadastrado*/
if (edicao == false){
resposta = JOptionPane.showConfirmDialog(this,
"Incluir Registro?", "Novo",
//sendo falso � porque � novo "Inclus�o",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);
if (resposta == JOptionPane.OK_OPTION){
//fazendo a inclus�o do contato na agenda
Pessoa p = new Pessoa(textNome.getText(),
textTelefone.getText(),
textEmail.getText(),
textEndereco.getText());
Main.minhaAgenda.add(p);

JOptionPane.showMessageDialog(this,
"Inclus�o efetuada!!!",
"Inclus�o",
JOptionPane.INFORMATION_MESSAGE);

//adiciona uma linha nova de cadastro na tela pricipal da agenda
pai.addRow(new String[]{p.getCodigo(),
p.getNome(),
p.getTelefone(),
p.getEmail(),
p.getEndereco()});

this.dispose();
}
}
else{ //se edicao = true indica que � uma altera��o.
resposta = JOptionPane.showConfirmDialog(this,
"Salvar Altera��es",
"Edi��o",
JOptionPane.OK_CANCEL_OPTION,
JOptionPane.QUESTION_MESSAGE);

if (resposta == JOptionPane.OK_OPTION){
Pessoa p = Main.minhaAgenda.getPessoa(codigo);

p.setValores(new String[]{textNome.getText(),
textTelefone.getText(),
textEmail.getText(),
textEndereco.getText()});

JOptionPane.showMessageDialog(this,
"Edi��o efetuada!!!",
"Edi��o",
JOptionPane.INFORMATION_MESSAGE);

pai.atualizaTabela(new String[]{p.getCodigo(),
p.getNome(),
p.getTelefone(),
p.getEmail(),
p.getEndereco()});

this.dispose();
}
}
}
//fecha a janela do formul�rio.
private void buttonFecharActionPerformed(ActionEvent e){
this.dispose();
}


}