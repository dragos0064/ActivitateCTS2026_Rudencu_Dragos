package ro.ase.cts.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public void plateste(double sumaPlatita){
        this.modPlata.plateste(sumaPlatita);
    }

    public Calator(String nume, ModPlata modPlata) {
        this.nume = nume;
    }

    public Calator(String nume) {
        this.nume = nume;
        this.modPlata = new SMS();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
