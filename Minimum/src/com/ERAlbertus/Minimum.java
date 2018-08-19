package com.ERAlbertus;

import java.util.*;

public class Minimum{

    public static int minValue(int[] values){
        Set<Integer> valuesCollection = new HashSet<>();
        String numString = "";
        for(int value : values){
            valuesCollection.add(value);
        }
        ArrayList<String> numbers = new ArrayList<String>();
        for(Integer num : valuesCollection){
            numbers.add(Integer.toString(num));
        }

        Collections.sort(numbers);
        for(String num : numbers){
            numString += num;
        }

        return Integer.parseInt(numString);
    }

}
