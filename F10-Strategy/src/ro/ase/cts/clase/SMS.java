package ro.ase.cts.clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(double sumaPlatita) {
        System.out.println("S-a platit cu SMS.");
    }
}
