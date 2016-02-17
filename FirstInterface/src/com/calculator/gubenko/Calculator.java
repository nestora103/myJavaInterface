package com.calculator.gubenko;

/**
 * Created by DmitriX on 17.02.2016.
 */
public class Calculator implements Calc  {
    @Override
    public int plus(int fVal, int tVal) {
        return fVal+tVal;
    }

    @Override
    public int minus(int fVal, int tVal) {
        return fVal-tVal;
    }

    @Override
    public float dev(int fVal, int tVal) {
        return fVal/tVal;
    }

    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.plus(10,10));
        System.out.println(calc.minus(5,10));
        System.out.println(calc.dev(40,10));
    }


}
