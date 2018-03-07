package com.hitesh.example.model.autowire.interfaces.impl;

import com.hitesh.example.model.autowire.interfaces.CompactDisc;

/**
 * @author hitesh mail: mr.hitesh@gmail.com
 * @date 07/08/2017 10:45
 */
public class BlankDisc implements CompactDisc{
    private String title;
    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
