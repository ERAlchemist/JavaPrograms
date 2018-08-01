package com.ERAlbertus;

public class Room {
    private String name;
    private Dimensions roomDimensions;
    private Couch couch;
    private Chair chair;

    public Room(String name, Dimensions roomDimensions, Couch couch, Chair chair) {
        this.name = name;
        this.roomDimensions = roomDimensions;
        this.couch = couch;
        this.chair = chair;
    }
    public void fixCouch () {
        couch.flipCushion();
    }

    public void reclineChair(){
        chair.recline();
    }

    public Chair getChair() {
        return chair;
    }

    public Couch getCouch() {
        return couch;
    }
}
