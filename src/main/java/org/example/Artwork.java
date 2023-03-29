package org.example;

public class Artwork {

    private String title;
    private String artist;
    private double price;


    public Artwork(String title, String artist){
        this.title = title;
        this.artist =artist;
        this.price = 0;
    }

//    getter

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getPrice() {
        return this.price;
    }

//    setters


    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setArtist(String newArtist) {
        this.artist = newArtist;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
