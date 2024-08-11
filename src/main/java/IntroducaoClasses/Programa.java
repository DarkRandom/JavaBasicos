package IntroducaoClasses;

import javax.swing.*;
import java.awt.*;

public class Programa extends Object {

    public static void main(String[]  args) {

//        Pessoa pessoa1 = new Pessoa();
//        pessoa1.setNome("João");
//        pessoa1.setCpf("7662234556");
//        pessoa1.setIdade(28);
//        pessoa1.setAltura(1.93);
//        pessoa1.setPeso(120);
//        pessoa1.setSalario(500);
//        pessoa1.setProfissao("Programa a dor");

//        Pessoa pessoa2 = Pessoa.builder()
//                .nome("Pedro")
//                .cpf("teste")
//                .idade(22)
//                .peso(60)
//                .altura(1.90)
//                .profissao("Vagabundo")
//                .salario(500)
//                .build();

        //System.out.println("Primeira Pessoa:");
        //PegarInfos.mostrarInfo(pessoa1);
        //PegarInfos.comparar(pessoa1,pessoa2);
        //double salariodeUmAno = Matematica.multiplicar(pessoa1.getSalario(),12);
        //JOptionPane.showMessageDialog( null, PegarInfos.pegarinfo(pessoa1) );
        //System.out.println(pessoa1.getNome() + " Recebe por ano o valor de: R$ " + salariodeUmAno );

        JOptionPane.showMessageDialog(null,"Olá vamos criar uma conta para você!");
        String nome = JOptionPane.showInputDialog("Vamos começar com seu nome. \n Digite ele abaixo:");
        String cpf = JOptionPane.showInputDialog("Certo " + nome + ". Agora precisamos do seu CPF. \n Digite ele abaixo:");

        while (!ValidadorCPF.isCPF(cpf)) {

            if (!ValidadorCPF.isCPF(cpf)) {

                JOptionPane.showMessageDialog(null, "O CPF digitado é invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
                cpf = JOptionPane.showInputDialog("Certo " + nome + ", agora precisamos do seu CPF. \n Digite ele abaixo:");

            }

        }

        String idade = JOptionPane.showInputDialog("Certo, agora precisamos da sua idade. \n porfavor digite a baixo:");
        String peso = JOptionPane.showInputDialog("Certo, agora precisamos do seu peso. \n porfavor digite a baixo:");
        String altura = JOptionPane.showInputDialog("Certo, agora precisamos da sua altura. \n porfavor digite a baixo:");
        String salario = JOptionPane.showInputDialog("Certo, agora precisamos saber quanto você ganha. \n porfavor digite a baixo:");
        String profissao = JOptionPane.showInputDialog("Certo, agora precisamos da sua profissão. \n porfavor digite a baixo:");

        Pessoa pessoa1 = Pessoa.builder()
            .nome(nome)
            .cpf(cpf)
            .idade(Integer.parseInt(idade))
            .peso(Double.parseDouble(peso))
            .altura(Double.parseDouble(altura))
            .salario(Double.parseDouble(salario))
            .profissao(profissao)
            .build();

        JOptionPane.showMessageDialog(null,"Conta criada com sucesso!");
        JOptionPane.showMessageDialog(null,"Seus dados \n" + PegarInfos.pegarinfo(pessoa1) );

    }

}
