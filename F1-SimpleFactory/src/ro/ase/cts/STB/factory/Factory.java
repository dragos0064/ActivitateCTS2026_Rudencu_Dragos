package ro.ase.cts.STB.factory;

import ro.ase.cts.STB.clase.Autobuz;
import ro.ase.cts.STB.clase.MijlocTransport;
import ro.ase.cts.STB.clase.Tramvai;
import ro.ase.cts.STB.clase.Troleibuz;

public class Factory {
    public MijlocTransport getMijlocTransport(TipTransport tip, String numarInmatriculare) throws Exception {
            if(tip == TipTransport.AUTOBUZ)
                return new Autobuz(numarInmatriculare);
            if(tip == TipTransport.TRAMVAI)
                return new Tramvai(numarInmatriculare);
            if(tip == TipTransport.TROLEIBUZ)
                return new Troleibuz(numarInmatriculare);
            return null;
    }
}
