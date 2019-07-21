package com.stackroute.pe3;

public class ExceptionChecker {

    ExceptionChecker(String msg) {
        msg = "this is bound to execute";
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {
        //throws exception
        try {
            throw new Exception();
        }
        //catches exception
        catch (Exception e) {
            e.printStackTrace();
        }
        //this block will get executed wether the exception occurs or not

        finally {
            System.out.println("i will get printed");
        }

    }
}


