package org.example;

import java.util.ArrayList;

public class Gallery {

    private String name;

    private double till;

    private int stock;

    private ArrayList<Artwork> artwork;


    public Gallery(String name, double till, int stock, Artwork artwork){
        this.name = name;
        this.till = till;
        this.stock = stock;
        this.artwork = new ArrayList<>();

    }

    public String getName(){
    return this.name;
     }

    public double getTill(){
    return this.till;
    }

    public int getStock(){
    return this.stock;
    }

    public ArrayList<Artwork> getArtwork(){
    return this.artwork;
    }

    public void setStock(int quantityStock) {
        this.stock -= quantityStock;
    }
// public int setStock( int amount){
    //return this.stock += amount; }

    //public void setStock( int amount){
        //return this.stock -= get.artistPieces() }

    //public void setTill( double amount){
    //this.}

}
