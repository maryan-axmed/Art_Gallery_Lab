package org.example;

import java.util.ArrayList;

public class Gallery {

    private String name;

    private double till;


    private ArrayList<Artwork> artworks;


    public Gallery(String galleryName, double till){
        this.name = galleryName;
        this.till = till;
        this.artworks = new ArrayList<>();

    }

    public String getgalleryName(){
    return this.name;
     }

    public double getTill(){
    return this.till;
    }

    public ArrayList<Artwork> getArtworks(){
    return this.artworks;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public double receive(double amount){
            this.till += amount; // this.till = this.till + amount
         return amount;
     }

// public int setStock( int amount){
    //return this.stock += amount; }

    //public void setStock( int amount){
        //return this.stock -= get.artistPieces() }

    //public void setTill( double amount){
    //this.}

}
