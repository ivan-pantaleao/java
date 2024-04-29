package condicional;

import java.util.Scanner;

public class Ex18Ivan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, quad, cubo, raiz;

        System.out.println("digite um número: ");
        num = sc.nextDouble();

        while (num > 0) {
            quad = num * num;
            cubo = num * num * num;
            raiz = Math.sqrt(num);
            System.out.println("raiz = "+ raiz + " quadrado: " + quad + " cubo: " + cubo + ".");
            num = sc.nextDouble();
        }

       
        sc.close();
    }

}