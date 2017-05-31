package com.company;

import java.io.*;
import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.26.
 */
public class Uzduotis18 {

    // tekstiniu failu irasymas ir skaitymas is ju

    public Uzduotis18() {
        Irasymas objektas = new Irasymas();
        objektas.paklausimas();
        objektas.irasymasIFaila();

        Skaitymas objektas2 = new Skaitymas();
        objektas2.paklausimas();
        objektas2.atidarytiFaila();
        objektas2.skaitymasIsFailo();
    }

    public class Irasymas {
        private String _failoVardas;
        private Scanner _sc;
        private FileWriter _out = null;

        public Irasymas() {
            _sc = new Scanner(System.in);
        }

        public void paklausimas() {
            System.out.println("Iveskite naujo failo pavadinimą sukurimui");
            _failoVardas = _sc.nextLine();

        }

        public void irasymasIFaila() {
            System.out.println("Iveskite teksta ka rasysite i faila");
            System.out.println("parasius pabaiga irasymas bus nutrauktas");
            String tekstas = _sc.nextLine();
            try {
                _out = new FileWriter(_failoVardas);
                while (!tekstas.equals("pabaiga")) {
                    _out.write(tekstas);
                    _out.write('\n');
                    tekstas = _sc.nextLine();
                }
                _out.close();
            } catch (Exception e) {
            }
        }
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
                    System.out.println(eilute);
                    eilute = _bufferis.readLine();
                }
                _bufferis.close();
                _in.close();
            } catch (Exception e) {

            }
        }
    }

}


