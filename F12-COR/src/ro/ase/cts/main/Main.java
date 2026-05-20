package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler autobuz = new CalatorieAutobuz();
        CalatorieHandler metrou = new CalatorieMetrou();
        CalatorieHandler troleibuz = new CalatorieTroleibuz();
        CalatorieHandler tramvai = new CalatorieTramvai();

        troleibuz.setCalatorieHandler(autobuz);
        autobuz.setCalatorieHandler(tramvai);
        tramvai.setCalatorieHandler(metrou);

        System.out.println(autobuz.getCalatorie(4));
    }
}
