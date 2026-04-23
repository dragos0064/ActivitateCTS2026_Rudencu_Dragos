package cts.Rudencu.Dragos.g1096.main;

import cts.Rudencu.Dragos.g1096.builder.PachetZbor;

public class Main {
    public static void main(String[] args) {
        PachetZbor pachet1 = new PachetZbor.PachetZborBuilder("Badea", "0078").build();

        PachetZbor pachet2 = new PachetZbor.PachetZborBuilder("Dragos","0888")
                .setImbarcarePrioritara(true).setAccesLoungeVIP(true).build();

        System.out.println(pachet1);
        System.out.println(pachet2);
    }
}
