package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class InsotitorZbor implements AngajatAerian{
    private String nume;

    public InsotitorZbor(String nume) {
        this.nume = nume;
    }

    @Override
    public void raporteazaLaMunca() {
        System.out.println("Cabină: Însoțitorul de zbor " + nume + " întâmpină pasagerii și face instructajul de siguranță.");
    }
}
