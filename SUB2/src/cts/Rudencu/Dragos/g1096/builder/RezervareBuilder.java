package cts.Rudencu.Dragos.g1096.builder;

public class RezervareBuilder implements RezervareBuilderAbstract{
    private String numeClient;
    private int numarNopti;

    private boolean micDejunInclus=false;
    private boolean patSuplimentar=false;
    private boolean vedereLaMare=false;
    private boolean transferAeroport=false;

    public RezervareBuilder(String numeClient, int numarNopti) {
        this.numeClient = numeClient;
        this.numarNopti = numarNopti;
    }

    public RezervareBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public RezervareBuilder setPatSuplimentar(boolean patSuplimentar) {
        this.patSuplimentar = patSuplimentar;
        return this;

    }

    public RezervareBuilder setVedereLaMare(boolean vedereLaMare) {
        this.vedereLaMare = vedereLaMare;
        return this;
    }

    public RezervareBuilder setTransferAeroport(boolean transferAeroport) {
        this.transferAeroport = transferAeroport;
        return this;
    }

    @Override
    public RezervareCamera build() {
        return new RezervareCamera(numeClient,numarNopti,micDejunInclus,patSuplimentar,vedereLaMare,transferAeroport);
    }
}
