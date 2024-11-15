package com.aula02;
import javax.swing.JOptionPane;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        //FiguraGeometrica objFiguraGeometrica = new FiguraGeometrioca("Triangulo");

        iniciar();
    }

    public static void iniciar() {

        //FiguraGeometrica objFiguraGeometrica = new FiguraGeometrioca("Triangulo");

        Pessoa objPessoa = new Pessoa();
        Aluno objAluno = new Aluno();

        objAluno.setNome("Walter Filho");
        objAluno.setIdade(18);


        entradaDados(objPessoa);
        saidaDados(objPessoa);

    }

    public static void entradaDados(Pessoa objPessoa) {
        objPessoa.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        //objPessoa.setCPF(JOptionPane.showInputDialog("Digite seu CPF: "));
        //objPessoa.setRG(JOptionPane.showInputDialog("Digite seu RG: "));
        objPessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        objPessoa.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: ")));
        objPessoa.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: ")));
    }

    public static void saidaDados(Pessoa objPessoa) {
        StringBuilder saidaMensagem = new StringBuilder();
        saidaMensagem.append("Nome: ").append(objPessoa.getNome());
        saidaMensagem.append("\n");
        //saidaMensagem.append("CPF: ").append(objPessoa.getCPF());
        //saidaMensagem.append("\n");
        //saidaMensagem.append("RG: ").append(objPessoa.getRG());
        //saidaMensagem.append("\n");
        saidaMensagem.append("Idade: ").append(objPessoa.getIdade());
        saidaMensagem.append("\n");
        saidaMensagem.append("Altura: ").append(objPessoa.getAltura());
        saidaMensagem.append("\n");
        saidaMensagem.append("Peso: ").append(objPessoa.getPeso());

        // exibir mensagem:
        JOptionPane.showMessageDialog(null, saidaMensagem);
    }

}
