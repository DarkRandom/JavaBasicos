package programacadastro;

public class VerificarCPF {

    public static boolean isValidCPF(String cpf) {
        // Remove pontos e traços do CPF, se existirem
        cpf = cpf.replaceAll("[^\\d]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais, o que é inválido
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int firstVerifier = 11 - (sum % 11);
        firstVerifier = (firstVerifier == 10 || firstVerifier == 11) ? 0 : firstVerifier;

        // Cálculo do segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int secondVerifier = 11 - (sum % 11);
        secondVerifier = (secondVerifier == 10 || secondVerifier == 11) ? 0 : secondVerifier;

        // Verifica se os dígitos verificadores correspondem aos do CPF fornecido
        return (firstVerifier == cpf.charAt(9) - '0') && (secondVerifier == cpf.charAt(10) - '0');
    }

}
