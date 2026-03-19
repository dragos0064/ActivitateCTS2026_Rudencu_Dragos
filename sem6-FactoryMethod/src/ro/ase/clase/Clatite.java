package ro.ase.clase;

public class Clatite extends Desert{

    public Clatite(int calorii, double pret, int gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public void afisareDescriere(){
        System.out.println("Clatite: "+ super.toString());
    }
}
