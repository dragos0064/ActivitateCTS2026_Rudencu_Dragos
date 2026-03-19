package ro.ase.cts.clase;

public class Rezervare implements PrototypeRezervare{
    private String numeClient;
    private int nrPersoane;
    private String oraRezervare;
    private String nrTelefon;

    public Rezervare(String numeClient, int nrPersoane, String oraRezervare, String nrTelefon) {
        if(numeClient.length()>=3){
            this.numeClient = numeClient;
        }
        else this.numeClient = "Client";

        if(nrPersoane>0){
            this.nrPersoane = nrPersoane;
        }
        else this.nrPersoane = 1;

        this.oraRezervare = oraRezervare;
        if(nrTelefon.length()==10){
            this.nrTelefon = nrTelefon;
        }
        else this.nrTelefon="000";

    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    private Rezervare() {
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervareNoua =new Rezervare();
        rezervareNoua.numeClient =  this.numeClient;
        rezervareNoua.nrPersoane =  this.nrPersoane;
        rezervareNoua.oraRezervare =  this.oraRezervare;
        rezervareNoua.nrTelefon =  this.nrTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare:  ");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        return sb.toString();
    }
}
