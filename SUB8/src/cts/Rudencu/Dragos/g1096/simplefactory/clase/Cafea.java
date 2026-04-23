package cts.Rudencu.Dragos.g1096.simplefactory.clase;

public class Cafea implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public Cafea(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Se prepara cafeaua....Se macina cafeaua...Gata! Preparatul " + this.nume +" este gata.");
    }
}
