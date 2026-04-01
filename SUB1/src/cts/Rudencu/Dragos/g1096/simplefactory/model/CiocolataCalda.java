package cts.Rudencu.Dragos.g1096.simplefactory.model;

public class CiocolataCalda implements Bautura{
    private String nume;
    private float volum;
    private float pret;
    private String culoareCiocolata;

    public CiocolataCalda(String nume, float volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public CiocolataCalda(String nume, float volum, float pret, String culoareCiocolata) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
        this.culoareCiocolata = culoareCiocolata;
    }

    @Override
    public void metodaPreparare() {
        System.out.println("SE BAGA LA APARAT......");
    }
}
