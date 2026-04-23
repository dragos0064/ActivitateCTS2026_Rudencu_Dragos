package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class BecSmart implements DispozitivSmart{
    private String camera;

    public BecSmart(String camera) {
        this.camera = camera;
    }

    @Override
    public void porneste() {
        System.out.println("Iluminat: Becul smart din " + camera + " s-a aprins.");
    }

}
