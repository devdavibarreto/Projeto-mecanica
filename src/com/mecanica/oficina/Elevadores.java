package com.mecanica.oficina;

import com.mecanica.model.Elevador;

import java.util.concurrent.ThreadLocalRandom;

public class Elevadores extends Elevador {

    public static boolean elevador1(boolean oculpados) {
        int numeroSorteado = elevadorOculpado();
        boolean oculpado = oculpados;
        return oculpado;
    }

    public static boolean elevador2(boolean oculpados) {
        boolean oculpado = oculpados;
        return oculpado;
    }
    public static boolean elevador3(boolean oculpados) {
        boolean oculpado = oculpados;
        return oculpado;
    }


// fazer para cada número sorteado um elevador ser selecionado

    public  static int elevadorOculpado() {
        int numeroSorteado = ThreadLocalRandom.current().nextInt(0, 4);
        boolean oculpados = false;
        if (numeroSorteado == 1) {
            oculpados = true;
            elevador1(oculpados);
        } else if (numeroSorteado == 2) {
            oculpados = true;
            elevador2(oculpados);
        }else if (numeroSorteado == 3) {
            oculpados = true;
            elevador3(oculpados);
        }
        else {
            oculpados = true;
            elevador1(oculpados);
            elevador2(oculpados);
            elevador3(oculpados);
        }
        return oculpados;

    }

    ;
}