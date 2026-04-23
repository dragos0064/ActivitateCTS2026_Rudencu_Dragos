package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class AerConditionatSmart implements DispozitivSmart{
    private String camera;

    public AerConditionatSmart(String camera) {
        this.camera = camera;
    }

    @Override
    public void porneste() {
        System.out.println("Climatizare: Aerul condiționat din '" + camera + "' a pornit modul de răcire.");
    }
}
