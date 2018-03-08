package Aula;

public class Exercicios {
public static void main(String args []){
	
	//Exercio 07
	int r = 12;
    float pi = (float) 3.1415;
    double area = pi*Math.pow(r,2); 
    System.out.println("A área é: " + area);
    
    //Exercicio 08
    int resto = 99 % 4;
    System.out.println("O resto é: " + resto);
    
    //Exercicio 09
    int numero = 7;
    double resultado = numero*0.5;
    System.out.println("O resultado é: " + resultado);
	
    //Exercicio 10
    int numero1 = 1;
    double Multi = 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
    System.out.println("O resultado é: " + Multi); 
	
    //Exercicio 11
    int M = 101;
    if ( M < 14) {
    System.out.println("O valor da variavel é menor que 14 e 100.");	    	    
    }
    else if ( M > 100) {
    System.out.println("O valor da variavel é maior que 14 e 100.");	
    }
     
    //Exercicio 12
    double pf = 4.75;
    if(pf >=1.99 && pf <=5.99)
    System.out.println(" O valor do número está entre 1.99 e 5.99");
    else
    System.out.println(" O valor do número não está entre 1.99 e 5.99");
			
    //Exercicio 13
    if(M == pf) System.out.println("Os valores são iguais.");
    else System.out.println("Os valores são diferentes");
			
    //Exercicio 14
    int alfa=5, f = 0; 
    double beta=1.5;
    f=(int) (alfa*beta);
    System.out.println(alfa+" X "+beta+" = "+f);
	    

   
    
}
}
