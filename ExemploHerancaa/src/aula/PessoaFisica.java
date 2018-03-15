package aula;

public class PessoaFisica extends Pessoa{
	private String rg;
	private String cpf;
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String args[]) {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Vinícius Ferreira da Silva");
		pessoa.setEndereco("Rua André Furtado de Mendonça");
		pessoa.setBairro("Jardim Romano");
		pessoa.setRg("12.345.678-9");
		pessoa.setCpf("503.720.318-03");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getRg());
		System.out.println(pessoa.getCpf());
	}

}
