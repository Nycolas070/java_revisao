package javarevisao;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite seu peso em kg: ");
		double peso = scn.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		double altura = scn.nextDouble();
		
		double imc = peso /(peso*altura);
		
		
		
		
		
		
	}

}
