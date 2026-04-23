package ro.ase.cts.singletonRegistry.clase;

import java.util.HashMap;

public class AutomatBilete {
    public static final HashMap<String,AutomatBilete> instanta = new HashMap<>();

    String codStatie;
    String numeStatie;

    int nrBileteDisponibile;
    double pretBilet;

    private AutomatBilete(String codStatie, String numeStatie) {
        this.codStatie = codStatie;
        this.numeStatie = numeStatie;
        this.nrBileteDisponibile = 0;
        this.pretBilet = 1;
    }

    public static synchronized AutomatBilete getInstance(String codStatie, String numeStatie){
        if(!instanta.containsKey(codStatie)){
            instanta.put(codStatie,new AutomatBilete(codStatie,numeStatie));
        }
        return instanta.get(codStatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutomatBilete{");
        sb.append("codStatie='").append(codStatie).append('\'');
        sb.append(", numeStatie='").append(numeStatie).append('\'');
        sb.append(", nrBileteDisponibile=").append(nrBileteDisponibile);
        sb.append(", pretBilet=").append(pretBilet);
        sb.append('}');
        return sb.toString();
    }


}
