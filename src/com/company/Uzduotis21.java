package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.26.
 */
public class Uzduotis21 {

    Uzduotis21(){
        nuskaitymas();
        isvedimas();
    }

    String tekstas;
    boolean arYra;

    private void nuskaitymas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite teksta:");
        tekstas = sc.nextLine();
        tikrinimas(tekstas);
    }

    private boolean tikrinimas(String tekstas){
        if (tekstas.contains("labas")){
            return false;
        }
        return true;
    }

    private void isvedimas(){
        if (arYra == false){
            System.out.println("Tekstas turi zodi labas");
        } else {
            System.out.println("Tekstas neturi zodziu labas");
        }
    }

}
