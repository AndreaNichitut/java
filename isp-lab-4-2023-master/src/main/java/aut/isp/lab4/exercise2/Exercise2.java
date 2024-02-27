package aut.isp.lab4.exercise2;

import aut.isp.lab4.exercise3.FishFeeder;

public class Exercise2 {
    public static void main(String[] args) {
       FishFeeder fish=new FishFeeder("a","b",10);
       System.out.println(fish.toString());
       fish.fillUp();
        System.out.println(fish.toString());
       fish.feed();
        System.out.println(fish.toString());
    }
}
