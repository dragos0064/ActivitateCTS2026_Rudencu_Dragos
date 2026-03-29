package ro.ase.cts.clase;

public class Director {
    private InternareBuilderAbstract builder;

    public Director(InternareBuilderAbstract builder) {
        this.builder = builder;
    }


    public void build(){
        builder.adaugaPatRabatabil();
        builder.adaugaMicDejun();
        builder.adaugaPapuciCamera();
        builder.adaugaHalatInterior();
    }

    public void buildHalatPapuci(){
        builder.adaugaHalatInterior();
        builder.adaugaPapuciCamera();
    }
}
