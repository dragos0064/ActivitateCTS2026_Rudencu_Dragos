package ro.cts.ase.clase.clase.loaders;

import ro.cts.ase.clase.clase.Aplicant;
import ro.cts.ase.clase.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsLoader implements IAplicantiLoader{
    @Override
    public List<Aplicant> load(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            String nume = input.next();
            String prenume = (input.next()).toString();
            int varsta = Integer.valueOf(input.nextInt());
            int punctaj = Integer.valueOf(input.nextInt());
            int nr = Integer.valueOf(input.nextInt());
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input.next();
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
