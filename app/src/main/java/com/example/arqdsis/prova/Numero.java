package com.example.arqdsis.prova;

import java.io.Serializable;

/**
 * Created by arqdsis on 25/10/2017.
 */


public class Numero implements Serializable, Comparable<Numero> {
    /*Thiago Dias de Lira  R.A: 201505992*/
    private int id;
    private int numero;


    public Numero (int id, int numero ) {
        /*Thiago Dias de Lira  R.A: 201505992*/
        this.id = id;
        this.numero = numero;
    }

    public int getId() {
        /*Thiago Dias de Lira  R.A: 201505992*/
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        /*Thiago Dias de Lira  R.A: 201505992*/
        return "Numero{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                '}';
    }

    @Override
    public int compareTo(Numero c) {
        return this.numero.compareTo(c.getNumero());
    }


}
