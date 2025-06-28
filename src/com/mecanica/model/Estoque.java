package com.mecanica.model;

public class Estoque {
    private String peca;
    private String registro;

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(String[] conjunto) {
        this.conjunto = conjunto;
    }

    private String[]  conjunto;
}
