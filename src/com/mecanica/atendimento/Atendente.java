package com.mecanica.atendimento;

import com.mecanica.model.AtendenteCallCenter;
import com.mecanica.model.AtendentePresencial;
import com.mecanica.model.Cliente;

public class Atendente {
    public static void main(String[] args) {
        AtendentePresencial recepcao = new AtendentePresencial();
        AtendenteCallCenter callCenter =  new AtendenteCallCenter();
        Cliente cliente = new Cliente();

        cliente.ligacao();

    }
}
