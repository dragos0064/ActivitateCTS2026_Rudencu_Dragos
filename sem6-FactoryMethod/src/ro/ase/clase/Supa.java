package ro.ase.clase;

public abstract class Supa implements FelDeMancare{
    int gramaj;
    double pret;

    public Supa(int gramaj, double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    public abstract void afisareDescriere();
}
