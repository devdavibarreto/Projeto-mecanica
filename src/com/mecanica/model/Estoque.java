package com.mecanica.model;

import com.mecanica.excecoes.ERROARRAYINDEX;

public class Estoque {
    private String peca;
    private String registro;

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
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


    public void verificarEstoque(){
        try{
            conjunto = getConjunto();

            if (conjunto == null){
                System.out.println("Sem peças no estoque");
            } else {
                for (int peca = 0; peca < conjunto.length; peca++) {

                   if (peca == 0){
                       peca ++;
                   }
                    System.out.println("AS PEÇAS EM ESTOQUE SÃO " + peca  + "º "+ conjunto[peca]);

                }
            }
        } catch (ERROARRAYINDEX e) {
            throw new ERROARRAYINDEX(e + "Contagem invalida");
        }

    }
}
