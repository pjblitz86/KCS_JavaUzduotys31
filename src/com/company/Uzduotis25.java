package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis25 {


    private String _failoVardas;
    private Scanner _sc = new Scanner(System.in);
    private FileReader _in = null;
    private BufferedReader _bufferis;
    private ArrayList<String> varduSarasas = new ArrayList<String>();

    public Uzduotis25(String failoVardas) {
        _failoVardas = failoVardas;
        atidarytiFaila();
        skaitymasIsFailo();
        atvaizdavimasIsSaraso();
    }


    private void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    // nuskaito vardus ir prideda i ArrayList
    private void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                varduSarasas.add(eilute);
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }
    private void atvaizdavimasIsSaraso(){
        System.out.println(varduSarasas);
    }

}

