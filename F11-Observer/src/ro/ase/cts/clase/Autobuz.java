package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Autobuz implements IAutobuz {
    private List<ICalator> lista = new ArrayList<>();

    public Autobuz() {
    }

    @Override
    public void notifica() {
        lista.forEach(calator -> calator.receptioneazaMesaj("PORNIRE"));
    }

    @Override
    public void abonareCalator(ICalator calator) {
        lista.add(calator);
    }

    @Override
    public void dezabonareCalator(ICalator calator) {
        lista.remove(calator);
    }
}
