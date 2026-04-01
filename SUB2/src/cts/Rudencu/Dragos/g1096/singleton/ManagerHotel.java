package cts.Rudencu.Dragos.g1096.singleton;

public class ManagerHotel implements IManagerHotel{
    private static ManagerHotel instanta = null;

    private String denumireHotel;
    private int nrTotalCamereDisponibile;

    private ManagerHotel() {
        this.denumireHotel = "Grand Hotel";
        this.nrTotalCamereDisponibile = 100;
    }

    public static synchronized ManagerHotel getInstance(){
        if(instanta == null){
            return instanta = new ManagerHotel();
        }
        return instanta;
    }

    public String getDenumireHotel() {
        return denumireHotel;
    }

    public int getNrTotalCamereDisponibile() {
        return nrTotalCamereDisponibile;
    }

    public void setNrTotalCamereDisponibile(int nrTotalCamereDisponibile) {
        this.nrTotalCamereDisponibile = nrTotalCamereDisponibile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ManagerHotel{");
        sb.append("denumireHotel='").append(denumireHotel).append('\'');
        sb.append(", nrTotalCamereDisponibile=").append(nrTotalCamereDisponibile);
        sb.append('}');
        return sb.toString();
    }
}
