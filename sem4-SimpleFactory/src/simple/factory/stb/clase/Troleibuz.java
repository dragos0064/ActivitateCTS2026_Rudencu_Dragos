package simple.factory.stb.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(String marca, int linia){
        super(marca, linia);
    }
    @Override
    public void afisareDescriere() {
        System.out.println("Troleibuz\n"+super.toString());
    }
}
