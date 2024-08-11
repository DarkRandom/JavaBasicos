package listaexercicio2;

public class Exercicio7 {
    public static void main(String[] args) {
        int resultado = 3;
        a(resultado);
        resultado = 2;
        b(resultado);
        resultado = 3;
        c(resultado);
    }

    private static void c(int resultado) {
        resultado = multiplicacao(resultado,9);
        resultado = divisao(resultado,3);
        resultado = soma(resultado,3);
        resultado =  multiplicacao(resultado,3);
        resultado =  multiplicacao(resultado,9);
    }

    private static void b(int resultado) {
        resultado = multiplicacao(resultado,2);
        resultado = resto(resultado,2);
        resultado = divisao(resultado,2);
        resultado = soma(resultado,2);
        resultado = sub(resultado,2);
    }

    private static void a(int resultado) {
        resultado = multiplicacao(resultado,6);
        resultado = divisao(resultado,2);
        resultado = soma(resultado,7);
        resultado =  sub(resultado,1);
    }

    private static int resto(int a, int b) {
        System.out.println(a % b);
        return a%b;
    }

    private static int sub(int a, int b) {
        System.out.println(a - b);
        return a-b;
    }

    private static int soma(int a, int b) {
        System.out.println(a + b);
        return a+b;
    }

    private static int divisao(int a, int b) {
        System.out.println(a / b);
        return a/b;
    }

    private static int multiplicacao(int a, int b) {
      System.out.println(a * b);
        return a*b;
    }
}
