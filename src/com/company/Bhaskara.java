package com.company;


public class Bhaskara {

    Delta delta;

    public Bhaskara(int numberA, int numberB, int numberC) {

        delta = new Delta(numberA, numberB, numberC);
    }

    public int getX1() {
        return getXY(delta, true);
    }

    public int getX2() {

        return getXY(delta, false);
    }

    private int getXY(Delta delta, boolean status) {

        int sub = status ? -delta.numberB + delta.deltaCalc() : -delta.numberB - delta.deltaCalc();
        return sub / (2 * delta.numberA);
    }
}


