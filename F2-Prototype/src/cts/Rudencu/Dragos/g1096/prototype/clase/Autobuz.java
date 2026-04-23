package cts.Rudencu.Dragos.g1096.prototype.clase;

public class Autobuz implements PrototypeAutobuz{
    private String marca;
    private int consum;
    private String linie;

    public Autobuz(String marca, int consum, String linie) {
        this.setMarca(marca);
        this.setConsum(consum);
        this.setLinie(linie);
    }

    private Autobuz() {
    }

    public void setMarca(String marca) {
        if(marca.length()>3){
            this.marca = marca;
        }
        else{
            this.marca = "default value";
        }

    }

    public void setConsum(int consum) {
        if(consum>=1){
            this.consum = consum;
        }else this.consum = 1;

    }

    public void setLinie(String linie) {
        if(linie.length()>1){
            this.linie = linie;
        }else this.linie = "Linie default";

    }

    @Override
    public PrototypeAutobuz clone() {
        Autobuz autobuz = new Autobuz();
        autobuz.marca = this.marca;
        autobuz.consum = this.consum;
        autobuz.linie = this.linie;
        return  autobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", linie='").append(linie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
