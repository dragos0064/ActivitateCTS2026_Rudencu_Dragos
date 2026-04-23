package cts.Rudencu.Dragos.g1096.simpleFactory;

public class RaportEroare implements TestReport{
    private String mesaj;

    public RaportEroare(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Mesaj: " + mesaj);
    }
}
