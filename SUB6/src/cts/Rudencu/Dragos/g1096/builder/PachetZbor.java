package cts.Rudencu.Dragos.g1096.builder;

public class PachetZbor {
    private String numePasager;
    private String codCursa;

    private boolean bagajCala;
    private boolean imbarcarePrioritara;
    private boolean accesLoungeVIP;
    private boolean meniuVegan;

    private PachetZbor(PachetZborBuilder builder) {
        this.numePasager = builder.numePasager;
        this.codCursa = builder.codCursa;
        this.bagajCala = builder.bagajCala;
        this.imbarcarePrioritara = builder.imbarcarePrioritara;
        this.accesLoungeVIP = builder.accesLoungeVIP;
        this.meniuVegan = builder.meniuVegan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetZbor{");
        sb.append("numePasager='").append(numePasager).append('\'');
        sb.append(", codCursa='").append(codCursa).append('\'');
        sb.append(", bagajCala=").append(bagajCala);
        sb.append(", imbarcarePrioritara=").append(imbarcarePrioritara);
        sb.append(", accesLoungeVIP=").append(accesLoungeVIP);
        sb.append(", meniuVegan=").append(meniuVegan);
        sb.append('}');
        return sb.toString();
    }

    public static class PachetZborBuilder{
        private String numePasager;
        private String codCursa;

        private boolean bagajCala;
        private boolean imbarcarePrioritara;
        private boolean accesLoungeVIP;
        private boolean meniuVegan;

        public PachetZborBuilder(String numePasager, String codCursa) {
            this.numePasager = numePasager;
            this.codCursa = codCursa;

            this.bagajCala = false;
            this.imbarcarePrioritara = false;
            this.accesLoungeVIP = false;
            this.meniuVegan = false;
        }

        public PachetZborBuilder setBagajCala(boolean bagajCala) {
            this.bagajCala = bagajCala;
            return this;
        }

        public PachetZborBuilder setImbarcarePrioritara(boolean imbarcarePrioritara) {
            this.imbarcarePrioritara = imbarcarePrioritara;
            return this;
        }

        public PachetZborBuilder setAccesLoungeVIP(boolean accesLoungeVIP) {
            this.accesLoungeVIP = accesLoungeVIP;
            return this;
        }

        public PachetZborBuilder setMeniuVegan(boolean meniuVegan) {
            this.meniuVegan = meniuVegan;
            return this;
        }

        public PachetZbor build(){
            return new PachetZbor(this);
        }

    }
}
