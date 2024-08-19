package programacadastro;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data @AllArgsConstructor
public class Aluno implements Serializable {

    int id;
    String nome;
    String cpf;
    String mae;
    String pai;
    String curso;
    LocalDate nascimento;

    public void mostrarAluno(){

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String dataFormatada = this.nascimento.format(formatoData);

        System.out.println("#######################");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + dataFormatada);
        System.out.println("Curso: " + this.curso);
        System.out.println("Mãe: " + this.mae);
        System.out.println("Pai: " + this.pai);
        System.out.println("#######################");

    }
}
