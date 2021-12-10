package com.cc.java.birds;

import com.cc.java.interfaces.*;


public class Bird implements Flyable,IFeathers {

    @Override
    public String fly() {
        return " I can fly";
    }

    @Override
    public String hasFeathers(){
        return " I am a bird, I have Feathers";
    }
    
}
