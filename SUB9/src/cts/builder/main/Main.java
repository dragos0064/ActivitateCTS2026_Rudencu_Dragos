package cts.builder.main;

import cts.builder.clase.AbstractBuilder;
import cts.builder.clase.Magazin;

public class Main {
    public static void main(String[] args) {
        Magazin magazin = Magazin.builder("HANDM", 350).setNrIntrari(5).build();
        Magazin magazinNou = Magazin.builder("House", 500).setNrIntrari(7).build();
        Magazin magazinPodeaMarmura = Magazin.builder("PRIMARK", 300).setTipPodea("Marmura").build();
        System.out.println(magazinNou);
        System.out.println(magazin);
        System.out.println(magazinPodeaMarmura);

    }
    }
