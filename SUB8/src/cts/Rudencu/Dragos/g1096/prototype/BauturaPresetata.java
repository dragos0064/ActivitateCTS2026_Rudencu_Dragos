package cts.Rudencu.Dragos.g1096.prototype;

public class BauturaPresetata implements PrototypeBautura{
    private String nume;
    private double volum;
    private String aroma;

    public BauturaPresetata(String nume, double volum, String aroma) {
        setNume(nume);
        setVolum(volum);
        setAroma(aroma);
    }

    private BauturaPresetata() {
    }

    public void setNume(String nume) {
        if(nume.length()>1)
            this.nume = nume;
        else this.nume = "-";
    }

    public void setVolum(double volum) {
        if(volum>10){
            this.volum = volum;
        }else{
            this.volum = 0;
        }
    }

    public void setAroma(String aroma) {
        if(aroma.length()>1){
            this.aroma = aroma;
        }else this.aroma = "Simpla";
    }

    @Override
    public PrototypeBautura clone() {
        BauturaPresetata bautura = new BauturaPresetata();
        bautura.nume = this.nume;
        bautura.volum = this.volum;
        bautura.aroma = this.aroma;
        return bautura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BauturaPresetata{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", aroma='").append(aroma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
