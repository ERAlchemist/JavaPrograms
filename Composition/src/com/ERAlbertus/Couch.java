package com.ERAlbertus;

public class Couch {
    private int numberOfCushions;
    private Dimensions couchDimensions;
    private String color;

    public Couch(int numberOfCushions, Dimensions couchDimensions, String color) {
        this.numberOfCushions = numberOfCushions;
        this.couchDimensions = couchDimensions;
        this.color = color;
    }
    public void flipCushion () {
        System.out.println("cushion flipped");
    }

    public int getNumberOfCushions() {
        return numberOfCushions;
    }

    public Dimensions getCouchDimensions() {
        return couchDimensions;
    }

    public String getColor() {
        return color;
    }



}
