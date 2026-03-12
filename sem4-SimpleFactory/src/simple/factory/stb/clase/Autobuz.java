package simple.factory.stb.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String marca, int linia){
        super(marca,linia);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuz");
        System.out.println(this);
    }


}
