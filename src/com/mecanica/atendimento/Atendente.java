package com.mecanica.atendimento;

import com.mecanica.atendimento.virtual.AtendimentoVirtual;
import com.mecanica.model.*;
import com.mecanica.oficina.estoque.EstoqueDePecas;

public class Atendente {
    public static void main(String[] args) {

        AtendentePresencial recepcao = new AtendentePresencial();
        recepcao.setNome("José");
        recepcao.setMatricula("328982");

        AtendenteCallCenter callCenter = new AtendenteCallCenter();
        callCenter.setNome("Pedro");
        callCenter.setRegistro("5147");
        callCenter.setMatricula("328982");


        Cliente clientePresencial = new Cliente();
        clientePresencial.setNome("Daniel");
        clientePresencial.setCarro("Astra");
        clientePresencial.setTelefone("33 5321-285");
        recepcao.atendimento();

        Cliente clienteTelefone = new Cliente();
        clienteTelefone.setNome("Moises");
        clienteTelefone.setCarro("Gol");
        clienteTelefone.setTelefone("33 5321-285");
        clienteTelefone.ligacao();

        Mecanico mecanico = new Mecanico();
        mecanico.verificarElevador();
        mecanico.mecanicoDisponivel();



        Estoque estoque = new Estoque();
        EstoqueDePecas pecas = new EstoqueDePecas();
        String[] novasPecas = pecas.pecasAtualizadas();
        estoque.setConjunto(novasPecas);
        estoque.verificarEstoque();


        AtendimentoVirtual clienteVirtual2 = new AtendimentoVirtual();
        clienteVirtual2.atendimentoVirtual();

    }
}
