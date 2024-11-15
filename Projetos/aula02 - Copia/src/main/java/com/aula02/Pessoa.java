package com.aula02;

public class Pessoa {

    private String nome;
    private int idade;
    private float altura;
    private float peso;

    private Documents cpf = new Documents();
    // private Documents rg = new Documents();


    // private String corOlhos;

    public Pessoa(float altura, int idade, String nome, float peso) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;

    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Métodos da cadeia:
    
    
    public String getCPF() {
        return cpf.getCPF();
    }
    
    public void setCPF(String cPF) {
        cpf.setCPF(cPF);
    }
    
    /*
    public String getRG() {
        return rg.getRG();
    }
    
    public void setRG(String rG) {
        rg.setRG(rG);
    }
 */

}

/* nome 'valor', idade, altura, peso, corOlhos */
// set - colocar um valor em um atributo;
// get - pegar um valor em um atributo;