package ase.cts.main;

import ase.cts.builder.Internare;
import ase.cts.builder.InternareBuilder;
import ase.cts.builder.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare(true, false,true,true,"Mihai Popescu");
        Internare internare2 = new Internare(false, false,false,false,"Ana Maria");
        InternareBuilder builder = new InternareBuilder("Ana Pop");
        Internare internare3 = builder.build();

        Internare internare4 = builder.setNume("Andrei Matei").setPat(true).setPapuci(true).setHalat(true).build();

        System.out.println(internare3);
        System.out.println(internare4);

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare101 = builderAlternativ.build("Goe");
        Internare internare102 = builderAlternativ.build("Gianluca");
        Internare internare103 = builderAlternativ.build("Nicolae");

        internare101.setNumePacient("Popescu John");
        System.out.println(internare101);
        System.out.println(internare102);
        System.out.println(internare103);
    }
}
