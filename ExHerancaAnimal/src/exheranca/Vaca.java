package exheranca;

public class Vaca extends Mamifero{
	private boolean permiteOrdenha;
	
	public void ordenhar() {
			System.out.println("A Vaca est� sendo ordenhada");
	}
	@Override
	public void falar() {
		System.out.println("A Vaca falou");
	}

}
