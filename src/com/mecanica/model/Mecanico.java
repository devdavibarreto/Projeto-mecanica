package com.mecanica.model;


import com.mecanica.oficina.Elevadores;

import java.util.concurrent.ThreadLocalRandom;

public class Mecanico {
    private String nome;
    int mecanicosDisponivel = mecanicosLivres();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos

    Elevadores elevador = new Elevadores();

    public void verificarElevador() {
        if (!elevador.elevador1()) {
            System.out.println("Elevador 01 está disponivel");

        } else if (!elevador.elevador2()) {
            System.out.println("Elevador 02 está disponivel");

        } else if (!elevador.elevador3()) {
            System.out.println("Elevador 03 está disponivel");
        } else {
            System.out.println("Todos os elevadores estão oculpados");
        }
    }

    public void mecanicoDisponivel() {
        if (mecanicosDisponivel >= 1) {
            System.out.println("Temos o total de " + mecanicosDisponivel + " mecanicos disponivel");
        } else {
            System.out.println("Não temos mecanicos disponiveis");
        }
    }

    public static int mecanicosLivres() {
        ThreadLocalRandom.current().nextInt(0, 10);
        return ThreadLocalRandom.current().nextInt(1, 10);
    }
}
