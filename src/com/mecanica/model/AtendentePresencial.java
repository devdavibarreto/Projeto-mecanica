package com.mecanica.model;

public class AtendentePresencial {
    private String nome;
    private String matricula;



    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void atendimento(){
        System.out.println("Olá sou o(a) atendende  da oficina Barreto´s Car como posso ajudar? ");
    }
}
