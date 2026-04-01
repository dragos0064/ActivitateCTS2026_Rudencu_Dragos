package cts.Rudencu.Dragos.g1096.simplefactory.model;

public class Cafea implements Bautura{
    private String nume;
    private float volum;
    private float pret;

    public Cafea(String nume, float volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public void metodaPreparare() {
        System.out.println("SE BAGA LA APARAT......");
    }
}
