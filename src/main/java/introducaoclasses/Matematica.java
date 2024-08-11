package introducaoclasses;

public class Matematica {

    public static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public static double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }

    public static double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }

    public static double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }

    public static double restoDivisao(double valor1, double valor2){
        return valor1 % valor2;
    }

    public static double elevar(double valor1, double valor2){
        return Math.pow(valor1,valor2);
    }

}
