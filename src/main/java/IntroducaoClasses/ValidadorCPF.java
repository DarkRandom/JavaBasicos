package IntroducaoClasses;

public class ValidadorCPF {

    public static boolean isCPF(String CPF) {
        // Remove qualquer caractere que não seja número
        CPF = CPF.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (CPF.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (ex: 111.111.111-11)
        if (CPF.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (CPF.charAt(i) - '0') * (10 - i);
        }

        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador == 10 || primeiroDigitoVerificador == 11) {
            primeiroDigitoVerificador = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (CPF.charAt(i) - '0') * (11 - i);
        }

        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador == 10 || segundoDigitoVerificador == 11) {
            segundoDigitoVerificador = 0;
        }

        // Verifica se os dígitos verificadores estão corretos
        return (primeiroDigitoVerificador == (CPF.charAt(9) - '0')) &&
                (segundoDigitoVerificador == (CPF.charAt(10) - '0'));
    }

    public static void main(String[] args) {
        String cpf = "981.125.150-22"; // Exemplo de CPF

        if (isCPF(cpf)) {
           // System.out.println("CPF válido!");
        } else {
            // System.out.println("CPF inválido!");
        }
    }
}

