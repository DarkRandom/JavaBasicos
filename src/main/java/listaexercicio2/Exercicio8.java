package listaexercicio2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        System.out.println(num1+num2+num3);
        System.out.println(num1+num2+num3/3);
        System.out.println(num1*num2*num3);
    }
}
