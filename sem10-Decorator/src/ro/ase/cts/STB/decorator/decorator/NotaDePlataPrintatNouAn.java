package ro.ase.cts.STB.decorator.decorator;

import ro.ase.cts.STB.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{
    public NotaDePlataPrintatNouAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare(){
        System.out.println("\nAn nou fericit!");
    }
}
