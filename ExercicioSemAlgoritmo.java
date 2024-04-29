package condicional;

import java.util.Scanner;

public class ExercicioSemAlgoritmo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, qntIdade = 0;
		float media = 0f;
		boolean fim = false;
		
		System.out.println("digite a idade: ");
		idade =	sc.nextInt();
		
		while (fim == false) {
			idade = sc.nextInt();
			if (idade <= 0) {
				fim = true;
			} else {
				media += idade;
				qntIdade++;
			}
			
		}
		sc.close();
		media /= qntIdade;
		System.out.println("a média das idades é aproximadamente "+ media + " anos");
	}

}
