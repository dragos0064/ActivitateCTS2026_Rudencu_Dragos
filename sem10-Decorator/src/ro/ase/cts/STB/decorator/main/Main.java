package ro.ase.cts.STB.decorator.main;

import ro.ase.cts.STB.decorator.clase.NotaDePlata;
import ro.ase.cts.STB.decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.STB.decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.STB.decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.STB.decorator.decorator.NotaDePlataPrintatNouAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(150.00f, "12 IANUARIE");
        notaDePlata.printeaza();

        int a = 2;
        NotaDePlataDecorator notaDePlataDecorator=null;
        if(a==1){
            notaDePlataDecorator= new NotaDePlataPrintatNouAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();

        notaDePlataDecorator.printeazaFelicitare();

    }
}
