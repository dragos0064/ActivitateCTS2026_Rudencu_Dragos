package ase.cts.builder;

public class InternareBuilderAlternativ implements InternareBuilderAbstractA{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareBuilderAlternativ setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareBuilderAlternativ setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareBuilderAlternativ setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareBuilderAlternativ setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }


    public InternareBuilderAlternativ() {
        this.patRabatabil = false;
        this.micDejun= false;
        this.halat=false;
        this.papuci=false;
    }

    @Override
    public Internare build(String nume) {
        Internare internare =  new Internare(this.patRabatabil, this.micDejun,this.papuci,this.halat,nume);
        return internare;
    }
}
