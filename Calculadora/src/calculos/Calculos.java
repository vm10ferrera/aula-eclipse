package calculos;

public class Calculos {
	
	public double mAdi(double n0, double n1) {
    	double resultado = n0 + n1;
    	return resultado;
    }
	
	public double mSub(double n0, double n1) {
    	double resultado = n0 - n1;
    	return resultado;
    }
	
	public double rQ(double n0) {
    	double resultado = java.lang.Math.sqrt(n0);
    	return resultado;
    }
	
	public double divi(double n0, double n1) {
    	double resultado = n0 / n1;
    	return resultado;
    }
	
	public double diviPorcent(double n0, double n1) {
    	double resultado = n0 / ((n0 * n1) / 100);
    	return resultado;
    }
	
	public double multiPorcent(double n0, double n1) {
    	double resultado = n0 * ((n0 * n1) / 100);
    	return resultado;
    }
	
	public double subPorcent(double n0, double n1) {
    	double resultado = n0 - (n0 * n1) / 100;
    	return resultado;
    }
	
	public double adiPorcent(double n0, double n1) {
    	double resultado = n0 + (n0 * n1) / 100;
    	return resultado;
    }
	
	public double porcent(double n0, double n1) {
    	double resultado = n0 * n1 / 100;
    	return resultado;
    }
	
	public double multi(double n0, double n1) {
    	double resultado = n0 * n1;
    	return resultado;
    }
	
    public double sub(double n0, double n1) {
    	double resultado = n0 - n1;
    	return resultado;
    }
    
    public double adi(double n0, double n1) {
    	double resultado = n0 + n1;
    	return resultado;
    }
    
    public double reciproco(double n0) {
    	double resultado = 1/n0;
    	return resultado;
    }
}