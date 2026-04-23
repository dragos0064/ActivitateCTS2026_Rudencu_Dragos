package cts.Rudencu.Dragos.g1096.singleton.models;

public abstract class AMasina {
    protected String numarInmatriculare;

    public AMasina(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public abstract void afiseazaDetalii();
}
