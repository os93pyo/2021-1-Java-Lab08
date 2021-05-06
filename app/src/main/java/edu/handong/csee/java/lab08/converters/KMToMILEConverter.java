package edu.handong.csee.java.lab08.converters;

/**
 * This class for KM to MILE converter
 */
public class KMToMILEConverter implements Convertible {

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
        result = fromValue / 1.6;
    }
    
}
