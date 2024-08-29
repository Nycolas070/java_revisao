package javarevisao;

import java.util.Scanner;
public class Real_para_D_e_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Real para Dólar e Euro.");
		
		System.out.println("Digite o valor em Real: ");
		
		Double r = scn.nextDouble();
		
		Double d = r/5.67;
		
		Double e = r/6.12;
		
		System.out.println("Conversão em Dólar " + d);
		System.out.println("Conversão em Euro " + e );

	}

}
