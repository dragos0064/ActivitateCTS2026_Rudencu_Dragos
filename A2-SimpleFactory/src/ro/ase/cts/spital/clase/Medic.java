package ro.ase.cts.spital.clase;

public class Medic implements PersonalSpital{

    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }
    @Override
    public void descrieRol() {
        System.out.printf("Sunt medicul " + nume + " si consult pacientii."+ "\n");
    }
}
