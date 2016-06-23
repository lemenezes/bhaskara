package com.company;


public class Delta {

    int numberA;
    int numberB;
    int numberC;

    public Delta(int numberA, int numberB, int numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public int deltaCalc() {
        return this.numberB * this.numberB - 4 * this.numberA * this.numberC;
    }

}
