package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.25.
 */
public class Uzduotis16 {

    public Uzduotis16(){
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
        ar = arRadoAB(zodziai);
    }

    private boolean arRadoAB(String z) {
        for (int i=0; i<z.length()-1; i++){

            if (z.charAt(i)== 'a' && z.charAt(i+1) != 'b'){
                return false;
            }
        }
        return true;
    }

    private void isvedimas(){
        if (ar == true){
            System.out.println("Tekstas " + zodziai + " turi ab");
        }
        else {
            System.out.println("Tekstas neturi ab");
        }

    }
}
