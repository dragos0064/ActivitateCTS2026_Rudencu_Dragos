package cts.Rudencu.Dragos.g1096.singleton.models;

public class ServiceAuto implements IService{
    private static ServiceAuto instanta = null;

    private AMasina masinaInReparatie = null;

    private ServiceAuto(){

    }

    public static synchronized ServiceAuto getInstance(){
        if(instanta == null){
            instanta = new ServiceAuto();
        }
        return instanta;
    }

    @Override
    public void preiaMasina(AMasina masina) {
        if(this.masinaInReparatie!=null){
            System.out.println("RESPINS, e deja ocupat de masina: " + this.masinaInReparatie.getNumarInmatriculare());
        }else
        {
            this.masinaInReparatie=masina;
            System.out.println("ACCEPTAT, Masina "+this.masinaInReparatie.getNumarInmatriculare()+" a intrat in service." );
        }

    }

    @Override
    public void elibereazaService() {
        if (this.masinaInReparatie != null) {
            System.out.println("[FINALIZAT] Mașina " + this.masinaInReparatie.getNumarInmatriculare() + " a fost reparată și a ieșit din service.");
            this.masinaInReparatie = null;
        } else {
            System.out.println("Service-ul este deja liber.");
        }
    }
}
