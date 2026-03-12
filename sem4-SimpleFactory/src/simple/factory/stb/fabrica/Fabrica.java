package simple.factory.stb.fabrica;

import simple.factory.stb.clase.Autobuz;
import simple.factory.stb.clase.MijlocTransport;
import simple.factory.stb.clase.Tramvai;
import simple.factory.stb.clase.Troleibuz;

public class Fabrica {
    public static Fabrica instance;

    public static Fabrica getInstance(){
        if(instance == null)
            instance = new Fabrica();
        return instance;
    }



    public MijlocTransport getMijlocTransport(String marca, int linie, Tip tip)
    throws Exception{
        if(tip == Tip.AUTOBUZ)
            return new Autobuz(marca,linie);
        if(tip == Tip.TRAMVAI)
            return new Tramvai(marca,linie);
        if(tip == Tip.TROLEIBUZ)
            return new Troleibuz(marca,linie);
        throw new Exception("Tip invalid!");
    }
}
