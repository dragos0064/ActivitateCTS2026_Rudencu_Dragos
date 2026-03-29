package ro.ase.cts.clase;

public class Internare {
    private String numePacient;

    private boolean patRabatabil = false;
    private boolean micDejunInclus = false;
    private boolean papuciCamera = false;
    private boolean halatInferior = false;

    public Internare(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInferior(boolean halatInferior) {
        this.halatInferior = halatInferior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halatInferior=").append(halatInferior);
        sb.append('}');
        return sb.toString();
    }
}
