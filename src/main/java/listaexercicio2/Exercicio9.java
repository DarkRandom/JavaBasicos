package listaexercicio2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é impar ou par.");
        int num;
        num = teclado.nextInt();
        if (  num % 2 == 0 ){
            System.out.println("O numero é par");
        }else{
            System.out.println("O numero é impar");
        }
    }
}
