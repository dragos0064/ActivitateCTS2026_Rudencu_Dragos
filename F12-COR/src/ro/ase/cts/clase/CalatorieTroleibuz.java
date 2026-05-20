package ro.ase.cts.clase;

public class CalatorieTroleibuz extends CalatorieHandler{
    @Override
    public String getCalatorie(double distanta) {
        if(distanta<3){
            return "Troleibuz";
        }else
            return this.calatorieHandler.getCalatorie(distanta);
    }
}
