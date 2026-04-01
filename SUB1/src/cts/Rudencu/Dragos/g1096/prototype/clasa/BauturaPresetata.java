package cts.Rudencu.Dragos.g1096.prototype.clasa;

import cts.Rudencu.Dragos.g1096.prototype.interfata.PrototypeBauturaPresetata;

public class BauturaPresetata implements PrototypeBauturaPresetata {
    private String nume;
    private float volum;
    private float pret;
    private String aroma;
    public BauturaPresetata(String nume, float volum, float pret,String aroma) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
        this.aroma = aroma;
    }

    private BauturaPresetata() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public PrototypeBauturaPresetata clone() {
        BauturaPresetata bauturaPresetata = new BauturaPresetata();
        bauturaPresetata.nume = this.nume;
        bauturaPresetata.volum=this.volum;
        bauturaPresetata.pret = this.pret;
        bauturaPresetata.aroma = this.aroma;
        return  bauturaPresetata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append(", aroma='").append(aroma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
