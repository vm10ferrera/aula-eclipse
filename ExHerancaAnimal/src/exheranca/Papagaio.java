package exheranca;

public class Papagaio extends Ave{
	private String vocabulario;
	
	@Override
	public void falar() {
		System.out.println("O Papagaio falou");
		
	}

	public String getVocabulario() {
		return vocabulario;
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}
}
