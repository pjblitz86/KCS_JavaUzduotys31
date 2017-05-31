package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by PauliusJ on 2017.05.28.
 */
public class Uzduotis26 {
    private String _failoVardas;
    private FileReader _in = null;
    private BufferedReader _bufferis;
    private int skaicius;
    private double suma;
    private ArrayList<Integer> skaiciuSarasas = new ArrayList<Integer>();

    public Uzduotis26(String failoVardas) {
        _failoVardas = failoVardas;
        atidarytiFaila();
        skaitymasIsFailo();
        atvaizdavimasIsSaraso();
        sumosSkaiciavimas();
    }

    private void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    // nuskaito skaicius ir prideda i ArrayList
    private void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                eilute = _bufferis.readLine();
                skaicius = Integer.parseInt(eilute);
                System.out.println(skaicius);
                skaiciuSarasas.add(skaicius);

            }
                _bufferis.close();
                _in.close();
            } catch(Exception e){

            }
        }
    private void atvaizdavimasIsSaraso(){
        System.out.println(skaiciuSarasas);
    }
    private void sumosSkaiciavimas(){
        for (int sk : skaiciuSarasas) {
            suma += sk;
        }
        System.out.println("Suma: " + suma);
    }
}
