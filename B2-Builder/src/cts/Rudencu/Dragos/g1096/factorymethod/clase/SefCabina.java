package cts.Rudencu.Dragos.g1096.factorymethod.clase;

public class SefCabina implements AngajatAerian{
    private String nume;

    public SefCabina(String nume) {
        this.nume = nume;
    }

    @Override
    public void raporteazaLaMunca() {
        System.out.println("Cabină: Șeful de cabină " + nume + " coordonează însoțitorii și verifică stocul de catering.");
    }

}
