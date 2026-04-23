package ro.ase.cts.singletonRegistry.clase;

import java.util.HashMap;

public class Automat {
    private static final HashMap<String, Automat> instante = new HashMap<>();

    String codStatie;
    String numeStatie;
    int nrBileteDisponibile;
    double pretBilet;

    private Automat(String codStatie, String numeStatie) {
        this.codStatie = codStatie;
        this.numeStatie = numeStatie;
        this.nrBileteDisponibile = 0;
        this.pretBilet = 1;
    }


    public static Automat getInstance(String codStatie, String numeStatie){
        if(!instante.containsKey(codStatie)){
            instante.put(codStatie,new Automat(codStatie,numeStatie));
        }
        return instante.get(codStatie);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Automat{");
        sb.append("codStatie='").append(codStatie).append('\'');
        sb.append(", numeStatie='").append(numeStatie).append('\'');
        sb.append(", nrBileteDisponibile=").append(nrBileteDisponibile);
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }
}
