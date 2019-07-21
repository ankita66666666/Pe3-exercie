package com.stackroute.pe3;

public class ConsecutiveNumberCheck {
    boolean result = false;

    //check string values
    public boolean checkConsecutive(String values) {
        String[] array = values.split(",");
        // condition starts
        for (int j = 0; j < array.length - 1; j++) {
            //   used parser to convert a num present in string into integer
            int difference = Integer.parseInt(array[j + 1]) - Integer.parseInt(array[j]);
            System.out.println(difference);
            if (difference == 1 || difference == -1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

