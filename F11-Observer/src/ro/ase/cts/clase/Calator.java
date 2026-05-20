package ro.ase.cts.clase;

public class Calator implements ICalator {
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaMesaj(String mesajReceptionat) {
        System.out.println("Auto pleaca: " + mesajReceptionat);
    }
}
