package com.cc.java.bees;

public class Drone extends HoneyBee{

    public String doYourJob(){
        return "I'm a drone, I'm going to date our Queen!";
    }

    @Override
    public String fly() {
        return "I am a worker bee , I fly at 8 mph!";
    }

     
}
