package ro.ase.cts.STB.main;

import ro.ase.cts.STB.clase.Director;
import ro.ase.cts.STB.clase.Internare;
import ro.ase.cts.STB.clase.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        InternareBuilder builder = new InternareBuilder("Mihai Ionel");
        Director director = new Director(builder);

        director.buildHalatPapuci();

        Internare internare1 = builder.getInternare();
        System.out.println(internare1);
        director.build();
        Internare internare2 = builder.getInternare();

        System.out.println(internare2);
    }
}
