package ro.ase.cts.clase;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", 7);
        Medic medic = new Medic();
        Salon salon = new Salon();

        if(pacient.getGravitate()>6){
            if(medic.areInregistrarePacientul(pacient)){
                int patLiber = salon.getPatLiber();
                if(patLiber!= -1){
                    System.out.println("Pacientul " + pacient.getNume()+" este internata in patul "+ patLiber);
                }
            }
        }
    }
}
