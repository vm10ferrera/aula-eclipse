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
    int n1 = 1;
    double Multi = n1 + n1 + n1 + n1 + n1 + n1 + n1 + n1;
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
    
    //Exercicio 15
    ArrayList Nomes = new ArrayList();
    Scanner s1 = new Scanner(System.in);
    System.out.println("Digite o primeiro nome: ");
    String nome1 = s1.nextLine();
    Scanner s2 = new Scanner(System.in);
    System.out.println("Digite o segundo nome: ");
    String nome2 = s2.nextLine();
    if(nome1.equals("") || nome2.equals("")){ 
    System.out.println("ERRO");
    }
    Nomes.add(nome1);
    Nomes.add(nome2);
    Collections.sort(Nomes);
    System.out.println(Nomes);
		
    //Exercicio 16
    double ladoA = 4, ladoB = 6;
    double Área = ladoA * ladoB;
    System.out.println("Lado A = "+ladoA+"\nLado B = "+ladoB+"\nA Área é = "+Área);
		
    //Exercicio 17
    if(ladoA == ladoB)
    System.out.println("\nA figura é um quadrado");
    else
    System.out.println("\nA figura é um retângulo");
	
    //Exercicio 18
    int a=25,b=50,rtd=0;
    rtd = a-(-b);
    System.out.println("O resultado: "+resultado);		
			
    //Exercicio 19
    System.out.println( a == 10 ? "A variavel'A' é igual a 10." : a>10? "A variavel 'A' é maior que 10." : "A variavel 'A' é menor que 10.");
		
    //Exercicio 20
    int RFINAL = r + resto + numero + numero1 + M + alfa + f + a + b + rtd;
    System.out.println("A soma dos valores é = "+RFINAL); 

	    

   
    
}
}
