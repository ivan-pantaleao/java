package trim1;

import java.util.Scanner;

public class DescontoINSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario_bruto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o valor do salário:");
		salario_bruto = sc.nextFloat();
		
		float desconto = (float) (salario_bruto*(1-0.11));
		
		System.out.printf("O salário com desconto será de R$ %f", desconto);
		
		sc.close();

	}
}