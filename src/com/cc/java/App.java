package com.cc.java;

import com.cc.java.bees.*;


public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    ausgabe(worker.doYourJob());
    ausgabe(queen.doYourJob());
    ausgabe(drone.doYourJob());

    ausgabe("------------------");

    ausgabe(worker.fly());
    ausgabe(queen.fly());
    ausgabe(drone.fly());

    ausgabe("------aber: ---------");

  
  
    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
