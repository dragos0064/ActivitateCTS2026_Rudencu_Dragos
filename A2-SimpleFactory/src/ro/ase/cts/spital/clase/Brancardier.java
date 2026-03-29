package ro.ase.cts.spital.clase;

public class Brancardier implements PersonalSpital{
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }
    @Override
    public void descrieRol() {
        System.out.println("Sunt Brancardierul "+ nume + " si transport pacientii."+ "\n");
    }
}
