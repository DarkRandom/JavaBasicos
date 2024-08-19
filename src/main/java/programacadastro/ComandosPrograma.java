package programacadastro;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ComandosPrograma {

    public static void mostrarComandos() throws IOException, ClassNotFoundException {

        System.out.println("########### COMANDOS DO PROGRAMA ###########");
        System.out.println("Use: /comandos para ver a lista de comandos!");
        System.out.println("Use: /lista para ver a lista de alunos!");
        System.out.println("Use: /adicionar para adicionar um novo aluno!");
        System.out.println("Use: /remover e coloque o id do aluno para remove-lo!");
        System.out.println("Use: /sair para sair do programa!");
        System.out.println("########### COMANDOS DO PROGRAMA ###########");

        aguardarComando();

    }

    public static void aguardarComando() throws IOException, ClassNotFoundException {

        Scanner teclado = new Scanner(System.in);

        String comando = teclado.next();

        if ( comando.equals("/comandos") ){

            mostrarComandos();

        } else if ( comando.equals("/lista") ) {

            List<Aluno> alunos = ManipulacaoArquivos.carregar();

            for (Aluno aluno:alunos){

                aluno.mostrarAluno();

            }

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Use: /comandos para ver os comandos!");

        } else if ( comando.equals("/adicionar") ) {

            List<Aluno> alunos = ManipulacaoArquivos.carregar();

            System.out.println("Porf avor digite o nome do Aluno.");
            String nome = teclado.next();
            System.out.println("Por favor digite o CPF do Aluno.");
            String cpf = "";
            Boolean cpfValido = false;

            while (!cpfValido){

                cpf = teclado.next();

                if (VerificarCPF.isValidCPF(cpf)){

                    cpfValido = true;

                }else{

                    System.out.println("Por favor digite um CPF valido!");

                }

            }

            System.out.println("Agora vamos para data de nascimento!");
            System.out.println("Por favor digite o dia do nascimento do aluno.");
            int dia = teclado.nextInt();
            System.out.println("Por favor digite o mes do nascimento do aluno.");
            int mes = teclado.nextInt();
            System.out.println("Por favor digite o ano do nascimento do aluno.");
            int ano = teclado.nextInt();
            LocalDate nascimento = LocalDate.of(ano,mes,dia);
            System.out.println("Certo agora digite o curso que o aluno está.");
            String curso = teclado.next();
            System.out.println("Por favor digite o nome do mãe do aluno.");
            String mae = teclado.next();
            System.out.println("Por favor digite o nome do pai do aluno.");
            String pai = teclado.next();
            int id = 0;

            if (alunos.size() > 0) id = alunos.size();

            alunos.add(new Aluno(id,nome,cpf,mae,pai,curso,nascimento));
            ManipulacaoArquivos.salvarAlunos(alunos);
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Use: /comandos para ver os comandos!");

        }else if ( comando.equals("/remover") ) {

            List<Aluno> alunos = ManipulacaoArquivos.carregar();
            System.out.println("Por favor digite o id do aluno que deseja remover.");
            int id = teclado.nextInt();
            alunos.remove(id);
            ManipulacaoArquivos.salvarAlunos(alunos);

        } else if ( comando.equals("/sair") ) {

            System.exit(0);

        }

        aguardarComando();

    }

}
