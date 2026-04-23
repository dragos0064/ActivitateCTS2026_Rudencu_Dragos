package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class Pilot implements AngajatAerian{
    private String nume;

    public Pilot(String nume) {
        this.nume = nume;
    }

    @Override
    public void raporteazaLaMunca() {
        System.out.println("Navigant: Pilotul " + nume + " a preluat comanda aeronavei și execută verificările pre-zbor.");
    }
}
