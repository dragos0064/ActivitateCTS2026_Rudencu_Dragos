package ro.ase.cts.clase;

public class Reteta implements PrototypeReteta{
    private String numeMedicament;
    private float cantitateSolutieActiva;
    private float cantitateExcipient;

    public Reteta(String numeMedicament, float cantitateSolutieActiva, float cantitateExcipient) {
        if(numeMedicament != null && numeMedicament.length()>3){
            this.numeMedicament = numeMedicament;
        }else{
            this.numeMedicament= "Medicament Necunoscut";
        }

        if(cantitateSolutieActiva > 0){
            this.cantitateSolutieActiva = cantitateSolutieActiva;
        }else{
            this.cantitateSolutieActiva=0;
        }

        if(cantitateSolutieActiva > 0){
            this.cantitateExcipient = cantitateExcipient;;
        }else{
            this.cantitateExcipient=0;
        }

    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void setCantitateSolutieActiva(float cantitateSolutieActiva) {
        this.cantitateSolutieActiva = cantitateSolutieActiva;
    }

    public void setCantitateExcipient(float cantitateExcipient) {
        this.cantitateExcipient = cantitateExcipient;
    }

    private Reteta() {
    }

    @Override
    public PrototypeReteta clone() {
        Reteta retetaNoua = new Reteta();
        retetaNoua.numeMedicament = this.numeMedicament;
        retetaNoua.cantitateSolutieActiva = this.cantitateSolutieActiva;
        retetaNoua.cantitateExcipient = this.cantitateExcipient;
        return retetaNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta: ");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", cantitateSolutieActiva=").append(cantitateSolutieActiva);
        sb.append(", cantitateExcipient=").append(cantitateExcipient);
        return sb.toString();
    }
}
