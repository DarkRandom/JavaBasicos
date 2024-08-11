package IntroducaoClasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Builder @NoArgsConstructor
public @Data class Pessoa {

    String nome;
    String cpf;
    double altura;
    double peso;
    int idade;
    String profissao;
    double salario;

}