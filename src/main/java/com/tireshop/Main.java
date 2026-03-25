package com.tireshop;


public class Main {
    public static void main(String[] args) {

        Service winter = new WinterTireChange(false, true, false);
        Service summer = new SummerTireChange(true, false, false);

        System.out.println("=========================== Exercise 1 ==================================");
        System.out.println(winter.getId() + " - " + winter.getName() + " : " + winter.calculatePrice() + " SEK");
        System.out.println(summer.getId() + " - " + summer.getName() + " : " + summer.calculatePrice() + " SEK");
        System.out.println();


        System.out.println("=========================== Exercise 2 ==================================");

    }
}
