package ro.ase.cts.STB.clase;

public class Medic {
    private String nume;

    public boolean areInregistrarePacientul(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
