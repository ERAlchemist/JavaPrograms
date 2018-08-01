package com.ERAlbertus;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel,  boolean isDuplex) {
       if(tonerLevel > -1 && tonerLevel <= 100){
           this.tonerLevel = tonerLevel;
       }else{
           this.tonerLevel = -1;
       }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int increaseToner (int newToner){

            if(newToner > 0 && newToner <= 100){
                if(this.tonerLevel + newToner > 100){
                    return -1;
                }
                this.tonerLevel += newToner;
                return this.tonerLevel;
            }else{
                return -1;
            }
        }


    public int printJob(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
            pagesToPrint = (pages/2) +(pages % 2);
            System.out.println("Printing in duplex mode");

        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel () {
        return tonerLevel;
    }
}
