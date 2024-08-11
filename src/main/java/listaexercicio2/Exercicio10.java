package listaexercicio2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        if(num1%num2 == 0){
            System.out.println("é multiplo");
        }else{
            System.out.println("não é multiplo");
        }
    }
}
