package com.aula02;

public class Documents {

    private String CPF;
    private String RG;

    public Documents() {
    }

    public Documents(String cPF, String rG) {
        CPF = cPF;
        RG = rG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public String getRG() {
        return RG;
    }

}