package listaexercicio2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double massa,altura,imc;
        System.out.println("Digite seu peso.");
        massa = teclado.nextDouble();
        System.out.println("Digite sua altura.");
        altura = teclado.nextDouble();
        imc = massa/(altura*altura);
        System.out.println("\t IMC \t Classificação \n \t < 16 \t Magreza leve \n \t 16 a < 17 \t Magreza moderada \n \t 17 a < 18,5 \t Magreza leve \n \t 18,5 a < 25 \t Saudável \n \t 25 a < 30 \t Sobrepeso \n \t 30 a < 35 \t Obesidade Grau I \n \t 35 a < 40 \t Obesidade Grau II(severa) \n \t >= 40 \t Obesidade Grau III(mórbida) ");
        if (imc <= 16){
            System.out.println(Math.floor(imc) + " Magreza Grave");
        } else if (imc < 17) {
            System.out.println(Math.floor(imc) + " Magreza Moderada");
        } else if (imc < 18.5) {
            System.out.println(Math.floor(imc) + " Magreza leve");
        } else if (imc < 25) {
            System.out.println(Math.floor(imc) + " Saudável");
        } else if (imc < 30) {
            System.out.println(Math.floor(imc) + " Sobrepeso");
        } else if (imc < 35) {
            System.out.println(Math.floor(imc) + " Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println(Math.floor(imc) + " Obesidade Grau II(severa)");
        } else if (imc >= 40) {
            System.out.println(Math.floor(imc) + " Obesidade Grau III(mórbida)");
        }
    }
}
