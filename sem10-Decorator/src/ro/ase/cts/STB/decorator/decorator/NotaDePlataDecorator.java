package ro.ase.cts.STB.decorator.decorator;

import ro.ase.cts.STB.decorator.clase.NotaDePlataAbstract;

public abstract class  NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlata;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }


    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public void printeazaFelicitare(){}
}
