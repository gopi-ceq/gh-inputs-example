package com.settermjd.twilio.envvars;

public class JP {
    public static void main(String[] args) {
  
        System.out.println(
            String.format("%s %s", System.getenv("INPUT_MESSAGE") ,System.getenv("INPUT_NAME"))
           
        );

    }
}
