package cts.Rudencu.Dragos.g1096.singleton.models;

public class MasinaClient extends AMasina{
    public MasinaClient(String numarInmatriculare){
        super(numarInmatriculare);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Autoturism cu numărul: " + numarInmatriculare);
    }

}
