package cts.Rudencu.Dragos.g1096.builder;

public class RezervareCamera {
    private String numeClient;
    private int numarNopti;

    private boolean micDejunInclus;
    private boolean patSuplimentar;
    private boolean vedereLaMare;
    private boolean transferAeroport;

    public RezervareCamera(String numeClient, int numarNopti, boolean micDejunInclus, boolean patSuplimentar, boolean vedereLaMare, boolean transferAeroport) {
        this.numeClient = numeClient;
        this.numarNopti = numarNopti;
        this.micDejunInclus = micDejunInclus;
        this.patSuplimentar = patSuplimentar;
        this.vedereLaMare = vedereLaMare;
        this.transferAeroport = transferAeroport;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNumarNopti(int numarNopti) {
        this.numarNopti = numarNopti;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPatSuplimentar(boolean patSuplimentar) {
        this.patSuplimentar = patSuplimentar;
    }

    public void setVedereLaMare(boolean vedereLaMare) {
        this.vedereLaMare = vedereLaMare;
    }

    public void setTransferAeroport(boolean transferAeroport) {
        this.transferAeroport = transferAeroport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareCamera{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarNopti=").append(numarNopti);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", patSuplimentar=").append(patSuplimentar);
        sb.append(", vedereLaMare=").append(vedereLaMare);
        sb.append(", transferAeroport=").append(transferAeroport);
        sb.append('}');
        return sb.toString();
    }
}
