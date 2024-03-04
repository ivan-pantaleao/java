package trim1;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		float n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de n1: ");
		n1 = sc.nextFloat();
		
		System.out.println("Informe o valor de n2: ");
		n2 = sc.nextFloat();
		
		System.out.println("Informe o valor de n3: ");
		n3 = sc.nextFloat();
		
		float media = (n1+n2+n3)/3;
		
		System.out.printf("A média de %f, %f e %f é %.2f", n1, n2, n3, media);

		sc.close();
	}

}