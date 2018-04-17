package calculadora;

import calculos.Calculos;

import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	private static final long serialVersionUID = 1L;

	JTextField tela = new JTextField("0");
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	
	JButton btnStEs = new JButton("<--");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+-");
	JButton btnRQ = new JButton("Raiz");
	
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDivi = new JButton("/");
	JButton btnPorcent = new JButton("%");
	
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMulti = new JButton("*");
	JButton btn1barrax = new JButton("1/x");
	
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMais = new JButton("+");

	Calculos mat = new Calculos();
	String sinal = null, sinal0 = null, virgula = null;
	double valor0 = 0, valor1 = 0, valorM = 0;
	String str, str0;
	
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		tela.setBounds(10, 15, 171, 50);
		paine.add(tela);
		
		
		btnMC.setBounds(10, 70, 30, 25);
		btnMC.setMargin(new Insets(1,1,1,1));
		paine.add(btnMC);
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorM = 0;
			}
		});
		btnMR.setBounds(45, 70, 30, 25);
		btnMR.setMargin(new Insets(1,1,1,1));
		paine.add(btnMR);
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText(valorM + "");
				if (sinal.equals("mmais")) {
					valorM = Double.parseDouble(mat.mAdi(valorM, valor0) + "");
					tela.setText(valorM + "");
				}
				else if(sinal.equals("mmenos")) {
					valorM = Double.parseDouble(mat.mSub(valorM, valor0) + "");
					tela.setText(valorM + "");
				}	
			}
		});
		btnMS.setBounds(80, 70, 30, 25);
		btnMS.setMargin(new Insets(1,1,1,1));
		paine.add(btnMS);
		btnMS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valorM = Double.parseDouble(tela.getText());
			}
		});
		btnMmais.setBounds(115, 70, 30, 25);
		btnMmais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmais);
		btnMmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(tela.getText());
				sinal = "mmais";
				virgula = null;
			}
		});
		
		btnMmenos.setBounds(150, 70, 30, 25);
		btnMmenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMmenos);
		btnMmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(tela.getText());
				sinal = "mmenos";
				virgula = null;
			}
		});
		
		btnStEs.setBounds(10, 100, 30, 25);
		btnStEs.setMargin(new Insets(1,1,1,1));
		paine.add(btnStEs);
		btnStEs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str = tela.getText();
				str0 = str.substring(0, str.length() - 1);
				tela.setText(str0);
			}
		});
		btnCE.setBounds(45, 100, 30, 25);
		btnCE.setMargin(new Insets(1,1,1,1));
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText("0");
			}
		});
		btnC.setBounds(80, 100, 30, 25);
		btnC.setMargin(new Insets(1,1,1,1));
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = null;
				sinal0 = null;
				virgula = null;
				valor0 = 0;
				valor1 = 0;
				tela.setText("0");
			}
		});
		btnMaisMenos.setBounds(115, 100, 30, 25);
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMaisMenos);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(tela.getText()) * -1;
				tela.setText(valor0 + "");
			}
		});
		btnRQ.setBounds(150, 100, 30, 25);
		btnRQ.setMargin(new Insets(1,1,1,1));
		paine.add(btnRQ);
		btnRQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(tela.getText());
				tela.setText(mat.rQ(valor0) + "");
				virgula = null;
			}
		});
		
		btnSete.setBounds(10, 130, 30, 25);
		btnSete.setMargin(new Insets(1,1,1,1));
		paine.add(btnSete);
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("7");
				}
				else {
					tela.setText(tela.getText() + "7");
				}
			}
		});
		btnOito.setBounds(45, 130, 30, 25);
		btnOito.setMargin(new Insets(1,1,1,1));
		paine.add(btnOito);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("8");
				}
				else {
					tela.setText(tela.getText() + "8");
				}
			}
		});
		btnNove.setBounds(80, 130, 30, 25);
		btnNove.setMargin(new Insets(1,1,1,1));
		paine.add(btnNove);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("9");
				}
				else {
					tela.setText(tela.getText() + "9");
				}
			}
		});
		btnDivi.setBounds(115, 130, 30, 25);
		btnDivi.setMargin(new Insets(1,1,1,1));
		paine.add(btnDivi);
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(tela.getText());
				sinal = "divisão";
				tela.setText("0");
			}
		});
		btnPorcent.setBounds(150, 130, 30, 25);
		btnPorcent.setMargin(new Insets(1,1,1,1));
		paine.add(btnPorcent);
		btnPorcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(tela.getText());
				sinal0 = "porcentagem";
				virgula = null;
			}
		});
		btnQuatro.setBounds(10, 160, 30, 25);
		btnQuatro.setMargin(new Insets(1,1,1,1));
		paine.add(btnQuatro);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("4");
				}
				else {
					tela.setText(tela.getText() + "4");
				}
			}
		});
		btnCinco.setBounds(45, 160, 30, 25);
		btnCinco.setMargin(new Insets(1,1,1,1));
		paine.add(btnCinco);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("5");
				}
				else {
					tela.setText(tela.getText() + "5");
				}
			}
		});
		btnSeis.setBounds(80, 160, 30, 25);
		btnSeis.setMargin(new Insets(1,1,1,1));
		paine.add(btnSeis);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("6");
				}
				else {
					tela.setText(tela.getText() + "6");
				}
			}
		});
		btnMulti.setBounds(115, 160, 30, 25);
		btnMulti.setMargin(new Insets(1,1,1,1));
		paine.add(btnMulti);
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(tela.getText());
				sinal = "multiplicação";
				tela.setText("0");
			}
		});
		btn1barrax.setBounds(150, 160, 30, 25);
		btn1barrax.setMargin(new Insets(1,1,1,1));
		paine.add(btn1barrax);
		btn1barrax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor0 = Double.parseDouble(tela.getText());
				tela.setText(mat.reciproco(valor0) + "");
				virgula = null;
			}
		});
		
		btnUm.setBounds(10, 190, 30, 25);
		btnUm.setMargin(new Insets(1,1,1,1));
		paine.add(btnUm);
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("1");
				}
				else {
					tela.setText(tela.getText() + "1");
				}
			}
		});
		btnDois.setBounds(45, 190, 30, 25);
		btnDois.setMargin(new Insets(1,1,1,1));
		paine.add(btnDois);
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("2");
				}
				else {
					tela.setText(tela.getText() + "2");
				}
			}
		});
		btnTres.setBounds(80, 190, 30, 25);
		btnTres.setMargin(new Insets(1,1,1,1));
		paine.add(btnTres);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("3");
				}
				else {
					tela.setText(tela.getText() + "3");
				}
			}
		});
		btnMenos.setBounds(115, 190, 30, 25);
		btnMenos.setMargin(new Insets(1,1,1,1));
		paine.add(btnMenos);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(tela.getText());
				sinal = "subtração";
				tela.setText("0");
				
			}
		});
		btnIgual.setBounds(150, 190, 30, 55);
		btnIgual.setMargin(new Insets(1,1,1,1));
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(tela.getText());
				
				if (sinal.equals("divisão")) {
					tela.setText(mat.divi(valor0, valor1) + "");
				}
				
				else if (sinal.equals("multiplicação")) {
					tela.setText(mat.multi(valor0, valor1) + "");
				}
				
				else if (sinal.equals("subtração")) {
					tela.setText(mat.sub(valor0, valor1) + "");
				}
				
				else if (sinal.equals("adição") && sinal0.equals("0")) {
					tela.setText(mat.adi(valor0, valor1) + "");
				}
				
				else if (sinal.equals("divisão") && sinal0.equals("porcentagem")) {
					tela.setText(mat.diviPorcent(valor0, valor1) + "");
				}
				
				else if (sinal.equals("multiplicação") && sinal0.equals("porcentagem")) {
					tela.setText(mat.multiPorcent(valor0, valor1) + "");
				}
				
				else if (sinal.equals("subtração") && sinal0.equals("porcentagem")) {
					tela.setText(mat.subPorcent(valor0, valor1) + "");
				}
				
				else if (sinal.equals("adição") && sinal0.equals("porcentagem")) {
					tela.setText(mat.adiPorcent(valor0, valor1) + "");
				}
				virgula = null;
			}
		});
		
		btnZero.setBounds(10, 220, 65, 25);
		btnZero.setMargin(new Insets(1,1,1,1));
		paine.add(btnZero);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tela.getText().equals("0")) {
					tela.setText("0");
				}
				else {
					tela.setText(tela.getText() + "0");
				}
			}
		});
		btnVirgula.setBounds(80, 220, 30, 25);
		btnVirgula.setMargin(new Insets(1,1,1,1));
		paine.add(btnVirgula);
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (virgula == "virgula") {
					tela.setText(tela.getText());
				}
				else
					tela.setText(tela.getText() + ".");
				virgula = "virgula";
			}
		});
		btnMais.setBounds(115, 220, 30, 25);
		btnMais.setMargin(new Insets(1,1,1,1));
		paine.add(btnMais);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				virgula = null;
				sinal0 = "0";
				valor0 = Double.parseDouble(tela.getText());
				sinal = "adição";
				tela.setText("0");
			}
		});
		
		this.setSize(197, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}
