package ro.ase.cts.spital.clase;

public class Asistent implements PersonalSpital{
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void descrieRol() {
        System.out.printf("Sunt Asistentul " + nume + " si recoltez analize"+ "\n");
    }
}
