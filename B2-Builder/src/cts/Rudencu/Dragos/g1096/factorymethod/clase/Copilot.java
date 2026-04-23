package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class Copilot implements AngajatAerian{
    private String nume;

    public Copilot(String nume) {
        this.nume = nume;
    }

    @Override
    public void raporteazaLaMunca() {
        System.out.println("Navigant: Copilotul " + nume + " asistă comandantul și configurează planul de zbor.");
    }
}
