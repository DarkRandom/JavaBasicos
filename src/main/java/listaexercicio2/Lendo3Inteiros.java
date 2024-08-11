package listaexercicio2;

import java.util.Scanner;

public class Lendo3Inteiros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        System.out.println(a*b*c);
    }
}
