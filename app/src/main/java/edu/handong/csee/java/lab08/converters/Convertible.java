package edu.handong.csee.java.lab08.converters;

/**
 * This interface is for declare methods for converters.
 */
public interface Convertible {

    /**
     * declare setFromValue method
     * @param fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * declare getConvertedValue method
     * @return
     */
    public double getConvertedValue();
    /**
     * declare convert method
     */
    public void convert();

}