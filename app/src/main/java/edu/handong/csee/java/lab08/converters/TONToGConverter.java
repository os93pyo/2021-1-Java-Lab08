package edu.handong.csee.java.lab08.converters;

/**
 * This class for TON to G converter
 */
public class TONToGConverter implements Convertible {

    private double fromValue;
    private double result;

     /**
     * setter for fromValue
     */
    @Override
    public void setFromValue(double fromValue) {
        this.fromValue = fromValue;
    }

    /**
     * getter for result 
     */
    @Override
    public double getConvertedValue() {   
        return result;
    }

    /**
     *  measurement convet method
     */
    @Override
    public void convert() {
        result = fromValue * 1000000;
    }
    
}
