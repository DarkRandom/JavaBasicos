package listaexercicio2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b;
        a = 5;
        b = teclado.nextInt();
        if(b > a){
            System.out.println("Numero digitado é maior que a variavel!");
        } else if (b < a) {
            System.out.println("Numero digitado é menor que a variavel!");
        } else if (b == a) {
            System.out.println("Os Numeros Sãos iguais");
        }
    }
}
