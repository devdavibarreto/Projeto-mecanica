package com.mecanica.model;

import java.util.Random;

public class AtendenteCallCenter {
    private String nome;
    private String matricula;
    private String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // metódos

    void atendimento(){
        System.out.println("Olá sou o(a) " + getNome() + " da oficina Barreto´s Car como posso ajudar? ");

    }




}
