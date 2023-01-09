package com.settermjd.twilio.envvars;

public class JP {
    public static void main(String[] args) {
        System.out.println(
            String.format("The current shell is: %s.", System.getenv("SHELL"))
           
        );
        System.out.println(
            String.format("The current shell is: %s.", System.getenv("INPUT_NAME"))
           
        );
        System.out.println(
            String.format("The current shell is: %s.", System.getenv("INPUT_MESSAGE"))
           
        );
    }
}
