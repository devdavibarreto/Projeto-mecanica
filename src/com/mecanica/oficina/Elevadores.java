package com.mecanica.oficina;

import com.mecanica.model.Elevador;

import java.util.concurrent.ThreadLocalRandom;

public class Elevadores extends Elevador {

    public static boolean elevador1(boolean oculpados) {
        boolean oculpado = oculpados;
        return oculpado;
    }

    public boolean elevador2() {
        boolean oculpado = elevadorOculpado();
        return oculpado;
    }
    public boolean elevador3() {
        boolean oculpado = elevadorOculpado();
        return oculpado;
    }


// fazer para cada número sorteado um elevador ser selecionado

    public  static boolean elevadorOculpado() {
        int numeroSorteado = ThreadLocalRandom.current().nextInt(0, 2);
        boolean oculpados = false;
        if (numeroSorteado == 1) {
            oculpados = true;
            elevador1(oculpados);
        }
        return oculpados;

    }

    ;
}