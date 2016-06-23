package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bhaskara bhaskara = new Bhaskara(1,-5,6);

        if (bhaskara.delta.deltaCalc() >= 0) {
            System.out.println(bhaskara.getX1() + " e " + bhaskara.getX2());
        } else {
            System.out.println("Delta does not have root !");
        }
    }
}
