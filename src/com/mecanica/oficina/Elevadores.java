package com.mecanica.oficina;

import com.mecanica.model.Elevador;

import java.util.concurrent.ThreadLocalRandom;

public class Elevadores extends Elevador {

    public  boolean elevador1() {
        int numeroSorteado = elevadorOculpado();
        boolean oculpado = false;

        if (numeroSorteado == 1 ){
            oculpado= true;
        }else if(numeroSorteado == 4)
            oculpado= true;

        return oculpado;
    }

    public  boolean elevador2() {
        int numeroSorteado = elevadorOculpado();
        boolean oculpado = false;

        if (numeroSorteado == 2 ){
            oculpado= true;
        }else if(numeroSorteado == 4)
            oculpado= true;

        return oculpado;
    }

    public  boolean elevador3() {
        int numeroSorteado = elevadorOculpado();
        boolean oculpado = false;

        if (numeroSorteado == 3 ){
            oculpado= true;
        }else if(numeroSorteado == 4)
            oculpado= true;

        return oculpado;
    }


// fazer para cada número sorteado um elevador ser selecionado

    public  static int elevadorOculpado() {
        int numeroSorteado = ThreadLocalRandom.current().nextInt(0, 4);

        return numeroSorteado;

    }

    ;
}