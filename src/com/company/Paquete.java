package com.company;

public class Paquete {

    private String identificador;
    public String getIdentificador() {
        return identificador;
    }

    private double volumen;
    public double getVolumen() {
        return volumen;
    }

    private double peso;
    public double getPeso() {
        return peso;
    }

    private boolean fragil;
    public boolean getFragil() {
        return fragil;
    }

    public Paquete(String identificador, double volumen, double peso, boolean fragil){
        this.identificador = identificador;
        this.volumen = volumen;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "identificador='" + identificador + '\'' +
                ", volumen=" + volumen +
                ", peso=" + peso +
                ", fragil='" + fragil + '\'' +
                '}';
    }
}
