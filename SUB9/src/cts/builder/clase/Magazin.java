package cts.builder.clase;

public class Magazin {
    private String nume;
    private double suprafata;

    private int nrIntrari;
    private String tipPodea;

    private Magazin(MagazinBuilder builder) {
        this.nume = builder.nume;
        this.suprafata = builder.suprafata;
        this.nrIntrari = builder.nrIntrari;
        this.tipPodea = builder.tipPodea;
    }

    public static MagazinBuilder builder(String nume, int suprafata){
        return new MagazinBuilder(nume,suprafata);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", tipPodea='").append(tipPodea).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class MagazinBuilder implements AbstractBuilder {

        private String nume;
        private double suprafata;

        private int nrIntrari;
        private String tipPodea;

        private MagazinBuilder(String nume, int suprafata) {
            this.nume = nume;
            this.suprafata = suprafata;

            this.nrIntrari=suprafata/100;
            this.tipPodea = "Normal";
        }

        public MagazinBuilder setNrIntrari(int nrIntrari) {
            if(this.suprafata/100 < nrIntrari){
                this.nrIntrari=nrIntrari;
            }
            return this;
        }

        public MagazinBuilder setTipPodea(String tipPodea) {
            this.tipPodea= tipPodea;
            return this;
        }

        @Override
        public Magazin build() {
            return new Magazin(this);
        }
    }
}
