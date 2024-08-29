package javarevisao;

import java.util.Scanner;

public class javarevisao_01_08_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura: ");
		
		double F = scn.nextDouble();
		
		double C = (F-32)*5/9;
		
		System.out.println("O valor em celsius: " + C);
		
		double K = C + 273.15;
		System.out.println("Valor em Kelvin: " + K);
		
		scn.close();
		
		
		

	}

}
