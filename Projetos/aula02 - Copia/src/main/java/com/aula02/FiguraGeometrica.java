package com.aula02;

public abstract class FiguraGeometrica {
    
    private String nomeFigura;
    
    public FiguraGeometrica(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public String getNomeFigura() {
        return nomeFigura;
    }
}
