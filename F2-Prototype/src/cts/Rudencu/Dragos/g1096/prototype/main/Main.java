package cts.Rudencu.Dragos.g1096.prototype.main;

import cts.Rudencu.Dragos.g1096.prototype.clase.Autobuz;
import cts.Rudencu.Dragos.g1096.prototype.clase.PrototypeAutobuz;

public class Main {
    public static void main(String[] args) {
        PrototypeAutobuz prototypeAutobuz = new Autobuz("mercedes", 7,"41");
        PrototypeAutobuz autobuz = prototypeAutobuz.clone();

        ((Autobuz)autobuz).setLinie("30");
        ((Autobuz)autobuz).setMarca("Ferrari");

        System.out.println(prototypeAutobuz);
        System.out.println(autobuz);
    }
}
