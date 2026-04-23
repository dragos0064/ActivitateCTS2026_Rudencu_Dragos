package cts.Rudencu.Dragos.g1096.simplefactory.clase;

public class Ciocolata_Calda implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public Ciocolata_Calda(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void metodaPreparare() {
        System.out.println("Punem cacao, amestecam...punem bezelele...Gata! Preparatul " + this.nume + " este gata.");
    }
}
