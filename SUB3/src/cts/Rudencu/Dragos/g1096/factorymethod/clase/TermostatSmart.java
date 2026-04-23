package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class TermostatSmart implements DispozitivSmart{
    private String camera;

    public TermostatSmart(String camera) {
        this.camera = camera;
    }

    @Override
    public void porneste() {
        System.out.println("Climatizare: Termostatul din '" + camera + "' este setat pe 22 de grade.");
    }
}
