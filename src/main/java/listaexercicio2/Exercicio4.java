package listaexercicio2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number;

        number = teclado.nextInt();
        System.out.println("Isso em um programa \n escrito em java!!!");
        if (number < 7) {
            System.out.println("A variavel é menor que 7");
        }
    }
}
