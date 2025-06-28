package com.mecanica.model;

import java.util.Random;



public class Cliente {

    private String nome;
    private String carro;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    AtendenteCallCenter atendende = new AtendenteCallCenter();

    public void ligacao(){
        do {
            System.out.println("TELEFONE TOCANDO");

        }while(tocandoTelefone());
        atendende.atendimento();

    }


    public static boolean tocandoTelefone(){
        boolean atendeu = new Random().nextInt(3)== 1;
        String atendimento = atendeu ? "Telefone atendido" : "No momento não temos atendentes disponiveis";
        System.out.println(atendimento);

        return !atendeu;
    }
}
