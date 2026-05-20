package ro.ase.cts.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(double sumaPlatita) {
        System.out.println("S-a platit cu cardu bancar");
    }
}
