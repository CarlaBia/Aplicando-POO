package IMC;

import java.util.Scanner;

public class CalcIMC {

	
	
	public static void main (String [] args) {
		
		Pessoa objetoPessoa = new Pessoa(70, 1.63);
		Scanner entrada = new Scanner (System.in);
		
		System.out.printf ("O seu Indice de Massa Corporal é: " + objetoPessoa.calcularIMC());
		
		System.out.println("\nDigite seu peso: ");
		objetoPessoa.setPeso(entrada.nextDouble());
		
		System.out.println ("Digite sua altura: ");
		objetoPessoa.setAltura(entrada.nextDouble());
		
		System.out.printf ("O seu Indice de Massa Corporal é: " + objetoPessoa.calcularIMC());
		
		
	}
}
