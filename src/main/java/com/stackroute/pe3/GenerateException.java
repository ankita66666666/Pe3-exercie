package com.stackroute.pe3;

public class GenerateException {

    public static void main(String[] args) {

        //throws ArraySize Exception
        try {
            throw new NegativeArraySizeException();
        }

        //catches ArraySize Exception
        catch (NegativeArraySizeException e1) {
            System.out.println(e1.toString());
        }


        //throws IndexOutOfBounds Exception
        try {
            throw new IndexOutOfBoundsException();
        }

        //catches IndexOutOfBounds Exception
        catch (IndexOutOfBoundsException e2) {
            System.out.println(e2.toString());
        }


        //throws NullPointer Exception
        try {
            throw new NullPointerException();
        }

        //catches NullPointer Exception
        catch (NullPointerException e3) {
            System.out.println(e3.toString());
        }
    }
}
