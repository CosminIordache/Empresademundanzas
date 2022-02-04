package com.company;

import java.util.*;

public class Camion {

    private List<Paquete> paquetesCamion = new LinkedList<>();

    public void addPaquete(Paquete paquete) {
        paquetesCamion.add(paquete);
    }

    public boolean cabePaquete(Paquete paquete) {
        boolean cabe;
        if ( volumenDisponible() >= paquete.getVolumen() && pesoDisponible() >= paquete.getPeso();){
            cabe = true;
            System.out.println("El paquete cabe en el camión");
        }else{
            cabe = false;
            System.out.println("El paquete no cabe en el camión");
        }

        return cabe;
    }

    public double pesoDisponible(Paquete paquete, Camion camion) {
        double peso = 0;

        if (paquete.getPeso() < camion.peso) {
            peso += camion.getPeso();
        }
        return peso;
    }

    public double volumenDisponible(Paquete paquete, Camion camion) {
        double volumen = 0;

        if (paquete.getVolumen() <= camion.getVolumenRemolque()) {
            volumen += camion.getVolumenRemolque();
        }
        return volumen;
    }

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    private double volumenRemolque;

    public double getVolumenRemolque() {
        return volumenRemolque;
    }

    private double peso;

    public double getPeso() {
        return peso;
    }

    public Camion(String matricula, double volumenRemolque, double peso) {
        this.matricula = matricula;
        this.volumenRemolque = volumenRemolque;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "matricula='" + matricula + '\'' +
                ", volumenRemolque=" + volumenRemolque +
                ", peso=" + peso +
                '}';
    }
}
