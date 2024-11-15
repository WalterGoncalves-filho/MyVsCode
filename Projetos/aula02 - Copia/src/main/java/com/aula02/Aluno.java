package com.aula02;

public class Aluno extends Pessoa{
    
private String numeroMatricula; // atributo encapsulado de aluno. 


// construtor sem agurmento. 
public Aluno() {
}

// Construtor com argumento.
public Aluno(String numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
}

// Encapsulamento do atributo:

// get do atributo numeroMatricula.
public String getNumeroMatricula() {
    return numeroMatricula;
}

// set ddo atributo numeroMatricula.
public void setNumeroMatricula(String numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
}


}
