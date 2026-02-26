package ro.cts.ase.clase.clase.loaders;

import ro.cts.ase.clase.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface IAplicantiLoader {
    List<Aplicant> load(String file) throws FileNotFoundException;


}
