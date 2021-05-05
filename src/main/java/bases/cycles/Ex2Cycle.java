package com.company.bases.cycles;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Ex2Cycle {
    public static void main(String[] args) {
        int popu = 1000000;
        int born = 14;
        int death = 8;
        for (int i = 1; i < 10; i++) {
            if (born > 7) {
                born = born - 1;
            }
            System.out.println(born);
            if (death > 6) {
                death = death - 1;
            }
            System.out.println(death);
            int diff = born - death;
            System.out.println(diff);
            popu = popu + (popu * diff) / 1000;
            System.out.println("Население в " + i + " год " + popu);
        }
    }
}
