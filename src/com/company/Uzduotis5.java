package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.24.
 */
public class Uzduotis5 {

    // konstruktorius
    public Uzduotis5() {
        ivesti5Skaicius();
    }

    // paprasyti ivesti 5 skaicius ir po ivedimo atvaizduoti suma ir viska ka ivede
    private void ivesti5Skaicius() {
        double[] skaiciai = new double[5];
        double suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Iveskite sveika arba realu skaiciu");
            skaiciai[i] = sc.nextDouble();
            suma += skaiciai[i];
        }
        System.out.println("Ivestu skaiciu suma = " + suma);
        System.out.println("Buvo ivesti skaiciai:");
        for(double x : skaiciai){
            System.out.println(x);
        }
    }
}
