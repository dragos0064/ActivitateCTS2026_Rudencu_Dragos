package ro.ase.cts.clase;

public class InternareBuilder implements InternareBuilderAbstract {
    private Internare internare;

    public InternareBuilder(String numePacient) {
        this.internare = new Internare(numePacient);
    }


    @Override
    public void adaugaPatRabatabil() {
        this.internare.setPatRabatabil(true);
    }

    @Override
    public void adaugaMicDejun() {
        this.internare.setMicDejunInclus(false);
    }

    @Override
    public void adaugaPapuciCamera() {
        this.internare.setPapuciCamera(false);
    }

    @Override
    public void adaugaHalatInterior() {
        this.internare.setHalatInferior(true);
    }


    public Internare getInternare(){
        return this.internare;
    }
}
