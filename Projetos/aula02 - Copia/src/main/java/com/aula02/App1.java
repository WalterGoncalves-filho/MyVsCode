package com.aula02;
import javax.swing.JOptionPane;



public class App1 {
    
    private App1(){
    }

    public static void main(String[] args) {

        iniciar();

        
    }

    public  static void iniciar(){

        Aluno objAluno = new Aluno();
        entradaDados(objAluno);
        saidaDados(objAluno);
        

    }

    public static void entradaDados(Aluno objAluno){

        objAluno.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        objAluno.setNumeroMatricula(JOptionPane.showInputDialog("Digite sua Matricula: "));
        objAluno.setCPF(JOptionPane.showInputDialog("Digite seu CPF: "));
        objAluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        objAluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: ")));
        objAluno.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: ")));
    }
    
    public static void saidaDados(Aluno objAluno){

        StringBuilder saidaMensagem = new StringBuilder();

        saidaMensagem.append("Nome: ").append(objAluno.getNome());
        saidaMensagem.append("\n");
        saidaMensagem.append("Matricula: ").append(objAluno.getNumeroMatricula());
        saidaMensagem.append("\n");
        saidaMensagem.append("CPF: ").append(objAluno.getCPF());
        saidaMensagem.append("\n");
        saidaMensagem.append("Idade: ").append(objAluno.getIdade());
        saidaMensagem.append("\n");
        saidaMensagem.append("Altura: ").append(objAluno.getAltura());
        saidaMensagem.append("\n");
        saidaMensagem.append("Peso: ").append(objAluno.getPeso());

        // exibir mensagem:
        JOptionPane.showMessageDialog(null, saidaMensagem);

    }


}
