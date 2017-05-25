package com.company;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis17 {

    public Uzduotis17(){
        ivedimas();
        isvedimas();
    }

    String zodziai;
    boolean ar;
    // ivedimas ir nuskaitymas
    private void ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite teksta:");
        zodziai = sc.nextLine();
        ar = arPolindromas(zodziai);
    }

    private boolean arPolindromas(String z) {
        for (int i=0; i<z.length(); i++){
            if (z.charAt(i) != z.charAt(z.length()-1-i)){
                return false;
            }

        }
        return true;
    }

    private void isvedimas(){
        if (ar == true){
            System.out.println("Tekstas " + zodziai + " yra polindromas");
        }
        else {
            System.out.println("Tai nepolindromas");
        }

    }
}
