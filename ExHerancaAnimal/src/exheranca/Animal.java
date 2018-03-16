package exheranca;

public class Animal {

	private String nome;
	protected String classe;
	
	public void imprime() {
		System.out.println("O nome do animal é: " + nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar() {
		System.out.println("O animal falou");
		
	}
	
}
