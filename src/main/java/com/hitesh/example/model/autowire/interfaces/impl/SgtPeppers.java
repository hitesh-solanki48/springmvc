package com.hitesh.example.model.autowire.interfaces.impl;

import com.hitesh.example.model.autowire.interfaces.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * @author hitesh mail: mr.hitesh@gmail.com
 * @date 04/08/2017 21:26
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Bearles";
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
