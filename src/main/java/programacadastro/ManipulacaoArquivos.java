package programacadastro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ManipulacaoArquivos {

    public static List<Aluno> carregar() throws IOException, ClassNotFoundException {

        List<Aluno> listaAlunos = new ArrayList<>();

        try {

            ObjectInputStream arquivoAlunos = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Estudos\\programacao\\POO\\DadosAlunos\\DadosAlunos.data"));
            listaAlunos = (ArrayList<Aluno>)  arquivoAlunos.readObject();
            arquivoAlunos.close();

        }catch (FileNotFoundException e){

            criarNovo();
            return listaAlunos;

        }

        return listaAlunos;

    }

    public static void criarNovo() throws IOException {

        List<Aluno> listaAlunos = new ArrayList<>();
        ObjectOutputStream arquivoAlunos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Estudos\\programacao\\POO\\DadosAlunos\\DadosAlunos.data"));
        arquivoAlunos.writeObject(listaAlunos);
        arquivoAlunos.close();

    }

    public static void salvarAlunos(List<Aluno> alunos) throws IOException {

        ObjectOutputStream arquivoAlunos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\Estudos\\programacao\\POO\\DadosAlunos\\DadosAlunos.data"));
        arquivoAlunos.writeObject(alunos);
        arquivoAlunos.close();

        System.out.println("Salvo com sucesso!");

    }

}
