package exheranca;

public class Ave extends Animal{
	
@Override
	public void falar() {
		System.out.println("A ave falou");
	}
	
	public void voar(int m) {
		System.out.println("O ave voou " + m + " metros.");
		
	}

}
