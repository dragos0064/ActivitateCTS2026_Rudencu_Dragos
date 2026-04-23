package cts.Rudencu.Dragos.g1096.prototype;

public class RutinaSmart implements PrototypeRutinaSmart{
    private String numeRutina;
    private String oraPornire;
    private int nivelLuminozitateLampi;
    private int temperaturaTintaClimatizare;


    public RutinaSmart(String numeRutina, String oraPornire, int nivelLuminozitateLampi, int temperaturaTintaClimatizare) {
        this.numeRutina = numeRutina;
        this.oraPornire = oraPornire;
        this.nivelLuminozitateLampi = nivelLuminozitateLampi;
        this.temperaturaTintaClimatizare = temperaturaTintaClimatizare;
    }

    private RutinaSmart() {
    }

    public void setNumeRutina(String numeRutina) {
        this.numeRutina = numeRutina;
    }

    public void setOraPornire(String oraPornire) {
        this.oraPornire = oraPornire;
    }


    @Override
    public PrototypeRutinaSmart clone() {
        RutinaSmart rutina = new RutinaSmart();
        rutina.numeRutina = this.numeRutina;
        rutina.oraPornire = this.oraPornire;
        rutina.nivelLuminozitateLampi = this.nivelLuminozitateLampi;
        rutina.temperaturaTintaClimatizare=this.temperaturaTintaClimatizare;
        return rutina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RutinaSmart{");
        sb.append("numeRutina='").append(numeRutina).append('\'');
        sb.append(", oraPornire='").append(oraPornire).append('\'');
        sb.append(", nivelLuminozitateLampi=").append(nivelLuminozitateLampi);
        sb.append(", temperaturaTintaClimatizare=").append(temperaturaTintaClimatizare);
        sb.append('}');
        return sb.toString();
    }
}
