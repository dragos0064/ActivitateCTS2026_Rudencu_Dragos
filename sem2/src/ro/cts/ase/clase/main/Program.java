package ro.cts.ase.clase.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.cts.ase.clase.clase.Aplicant;
import ro.cts.ase.clase.clase.loaders.AngajatiLoader;
import ro.cts.ase.clase.clase.loaders.AplicantiLoader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoader loader = new AngajatiLoader();
		try {
			listaAngajati =loader.load("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
