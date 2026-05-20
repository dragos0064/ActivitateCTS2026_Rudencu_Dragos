package ro.ase.cts.clase;

public abstract class CalatorieHandler {
    protected CalatorieHandler calatorieHandler=null;

    public CalatorieHandler() {
    }

    public void setCalatorieHandler(CalatorieHandler calatorieHandler) {
        this.calatorieHandler = calatorieHandler;
    }

    public abstract String getCalatorie(double distanta);
}
