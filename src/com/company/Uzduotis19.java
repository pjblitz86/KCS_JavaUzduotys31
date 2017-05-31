package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Uzduotis19 {
    public Uzduotis19() {
        Skaitymas objektas2 = new Skaitymas();
        objektas2.paklausimas();
        objektas2.atidarytiFaila();
        objektas2.skaitymasIsFailo();
    }

    public class Skaitymas {
        private String _failoVardas;
        private Scanner _sc;
        private FileReader _in = null;
        private BufferedReader _bufferis;

        public Skaitymas() {
            _sc = new Scanner(System.in);
        }

        public void paklausimas() {
            System.out.println("Iveskite failo pavadinimą is kurio norite skaityti");
            _failoVardas = _sc.nextLine();
        }

        public void atidarytiFaila() {
            try {
                _in = new FileReader(_failoVardas);
                _bufferis = new BufferedReader(_in);
            } catch (Exception e) {

            }
        }

        public void skaitymasIsFailo() {
            try {
                String eilute = _bufferis.readLine();
                while (eilute != null) {
                    eilute = _bufferis.readLine();
                    if (eilute.toLowerCase().charAt(0) == 'a') {
                        System.out.println(eilute);
                    }
                }
                _bufferis.close();
                _in.close();
            } catch (Exception e) {

            }
        }
    }


}
