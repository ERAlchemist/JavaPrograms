package com.ERAlbertus;

public class Chair {
    private Dimensions chairDimensions;
    private String color;
    private String chairType;

    public Chair(Dimensions chairDimensions, String color, String chairType) {
        this.chairDimensions = chairDimensions;
        this.color = color;
        this.chairType = chairType;
    }
    public void recline () {
        if(this.chairType == "recliner"){
            System.out.println("Chair => reclines");
        }
    }
    public Dimensions getChairDimensions() {
        return chairDimensions;
    }

    public String getColor() {
        return color;
    }

    public String getChairType() {
        return chairType;
    }
}
