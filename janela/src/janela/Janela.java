package janela;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Janela extends JFrame{
	
	JTextArea txtTexto = new JTextArea("Digite seu texto aqui!",15,30);
	JScrollPane barra = new JScrollPane(txtTexto);
	JLabel lblTitulo = new JLabel("O que não funciona?");
	JCheckBox chkJava = new JCheckBox("Java");
	JCheckBox chkC  = new JCheckBox("C#");
	JCheckBox chkWindows = new JCheckBox("Windows");
	
	ButtonGroup grupoSexo = new ButtonGroup();
	JRadioButton[] sexo = new JRadioButton[2];
	
	JLabel lblSexo = new JLabel("Selecione o sexo desejado:");
	
	public Janela() {
		super("Exemplo de Janela");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		barra.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		barra.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
		
		barra.setBounds(20, 20, 360, 150);
		pane.add(barra);

		lblTitulo.setBounds(20, 180, 200, 20);
		pane.add(lblTitulo);
		
		chkJava.setBounds(20, 200, 100, 20);
		pane.add(chkJava);
		
		chkC.setBounds(20, 220, 100, 20);
		pane.add(chkC);
		
		chkWindows.setBounds(20, 240, 100, 20);
		pane.add(chkWindows);
		
		lblSexo.setBounds(20, 280, 200, 20);
		pane.add(lblSexo);
		
		sexo[0] = new JRadioButton("Masculino");
		sexo[0].setBounds(20, 300, 100, 20);
		
		sexo[1] = new JRadioButton("Feminino");
		sexo[1].setBounds(20, 320, 100, 20);
		
		for (int i = 0; i < sexo.length; i++){
			grupoSexo.add(sexo[i]);
			pane.add(sexo[i]);
		}
		
		this.setSize(400,500);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		Janela Janela = new Janela();
	}
}
