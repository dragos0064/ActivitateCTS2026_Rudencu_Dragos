package ro.ase.cts.clase;

public class CalatorieMetrou extends CalatorieHandler {
    @Override
    public String getCalatorie(double distanta) {
        if(distanta>=10){
            return "Metrou";
        }else
            return this.calatorieHandler.getCalatorie(distanta);
    }
}
