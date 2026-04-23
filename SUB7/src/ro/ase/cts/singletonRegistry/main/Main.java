package ro.ase.cts.singletonRegistry.main;

import ro.ase.cts.singletonRegistry.clase.Automat;
import ro.ase.cts.singletonRegistry.clase.AutomatBilete;

public class Main {
    public static void main(String[] args) {
        Automat instanta1 =Automat.getInstance("A001", "A1");
        Automat instanta2 =Automat.getInstance("A001", "A2");
        Automat instanta3 =Automat.getInstance("A003", "A3");


        System.out.println(instanta1);
        System.out.println(instanta2);
        System.out.println(instanta3);

        AutomatBilete instantA1 = AutomatBilete.getInstance("B001","B1");
        AutomatBilete instantA2 = AutomatBilete.getInstance("B001","B2");
        AutomatBilete instantA3 = AutomatBilete.getInstance("B003","B3");

        System.out.println(instantA1);
        System.out.println(instantA2);
        System.out.println(instantA3);
    }
}
