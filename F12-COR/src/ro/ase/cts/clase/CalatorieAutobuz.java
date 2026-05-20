package ro.ase.cts.clase;

public class CalatorieAutobuz extends CalatorieHandler {
    @Override
    public String getCalatorie(double distanta) {
        if(distanta>=3 && distanta<=5){
            return "Autobuz";
        }else
            return this.calatorieHandler.getCalatorie(distanta);
    }
}
