package cts.Rudencu.Dragos.g1096.simplefactory.clase;

public class Ceai implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public Ceai(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Se pune plicul...Asteptam...Gata! Preparatul " + this.nume + " este gata.");
    }
}
