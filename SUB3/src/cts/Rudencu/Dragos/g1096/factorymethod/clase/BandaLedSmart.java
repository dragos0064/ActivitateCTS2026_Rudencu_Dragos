package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class BandaLedSmart implements DispozitivSmart{
    private String camera;

    public BandaLedSmart(String camera) {
        this.camera = camera;
    }

    @Override
    public void porneste() {
        System.out.println("Iluminat: Banda LED din '" + camera + "' ruleaza modul ambiental.");
    }
}
