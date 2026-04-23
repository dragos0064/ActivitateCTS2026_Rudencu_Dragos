package cts.Rudencu.Dragos.g1096.builder.clase;

public class Rezervare {
    private double ora;
    private int nrPersoane;

    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaPersonalizata;
    private int idGenMuzica;

    private Rezervare(RezervareBuilder builder) {
        this.ora = builder.ora;
        this.nrPersoane = builder.nrPersoane;
        this.asezareGeam = builder.asezareGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaPersonalizata = builder.muzicaPersonalizata;
        this.idGenMuzica = builder.idGenMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzicaPersonalizata=").append(muzicaPersonalizata);
        sb.append(", idGenMuzica=").append(idGenMuzica);
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder {
        private double ora;
        private int nrPersoane;

        private boolean asezareGeam;
        private boolean scauneErgonomice;
        private boolean decorareMasa;
        private boolean muzicaPersonalizata;
        private int idGenMuzica;

        public RezervareBuilder(double ora, int nrPersoane) {
            this.ora = ora;
            this.nrPersoane = nrPersoane;

            this.asezareGeam = false;
            this.scauneErgonomice = false;
            this.decorareMasa = false;
            this.muzicaPersonalizata = false;
            this.idGenMuzica = 0;
        }

        public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
            this.asezareGeam = asezareGeam;
            return this;
        }

        public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder setMuzicaPersonalizata(boolean muzicaPersonalizata) {
            this.muzicaPersonalizata = muzicaPersonalizata;
            return this;
        }

        public RezervareBuilder setIdGenMuzica(int idGenMuzica) {
            this.idGenMuzica = idGenMuzica;
            return this;
        }

        public Rezervare build(){
            return new Rezervare(this);
        }
    }

}
