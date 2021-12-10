package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.Bird;


public class App {

    // static Honeybee worker;

    public static void main(String[] args) {
      
    HoneyBee worker = new Worker();
    HoneyBee queen = new Queen();
    HoneyBee drone = new Drone();

    Bird bird = new Bird();

    outPut(worker.doYourJob());
    outPut(queen.doYourJob());
    outPut(drone.doYourJob());

    outPut("--------Bird(s)----------");

    outPut(bird.hasFeathers());

    outPut("--------Bees & Birds----------");

    outPut(worker.fly());
    outPut(queen.fly());
    outPut(drone.fly());
    outPut(bird.fly());

    }

    private static void outPut(String outStr) {
        System.out.println(outStr);
    }
}
