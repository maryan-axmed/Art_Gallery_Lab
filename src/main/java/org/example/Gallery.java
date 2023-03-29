package org.example;

import java.util.ArrayList;

public class Gallery {

    private String name;

    private double till;


    private ArrayList<Artwork> artworks;


    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();

    }

    public String getName(){
    return this.name;
     }

    public double getTill(){
    return this.till;
    }

    public ArrayList<Artwork> getArtworks(){
    return this.artworks;
    }

// public int setStock( int amount){
    //return this.stock += amount; }

    //public void setStock( int amount){
        //return this.stock -= get.artistPieces() }

    //public void setTill( double amount){
    //this.}

}
