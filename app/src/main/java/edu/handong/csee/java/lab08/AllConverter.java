package edu.handong.csee.java.lab08;

import edu.handong.csee.java.lab08.converters.*;

//import edu.handong.csee.java.lab08.converters.*;

/**
 * This class for converting measurement(KM,TON) at the same time
 */
public class AllConverter extends IntegratedConverter{

    private double fromValue;
    private String originalMeasure;
    
    /**
     * setter for fromValue
     * @param fromValue
     * @return fromValue 
     */
    public AllConverter setFromValue(double fromValue) {
        this.fromValue = fromValue;
        return this;

    }

    /**
     * setter for origianlMeasure
     * this is for choosing what kind of converter I use.
     * @param originalMeasure
     * @return
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * set fromValue, and use coverter that match with originMeasure
     * If originMeasure is KM, it converts M,MILE at the same time.
     * If originMeasure is TON, it converts KG,G at the same time.
     */
    public void convertAndPrintOut() {
        if(this.originalMeasure.equals("KM")) {
            KMToMConverter meter = new KMToMConverter();
            meter.setFromValue(fromValue);
            meter.convert();
            KMToMILEConverter mile = new KMToMILEConverter();
            mile.setFromValue(fromValue);
            mile.convert();
           
            System.out.println(fromValue +" " + originalMeasure + " to " + meter.getConvertedValue() + " " + "M");
            System.out.println(fromValue +" " + originalMeasure + " to " + mile.getConvertedValue() + " " + "MILE");
           

        }else if(this.originalMeasure.equals("TON")) {
            TONToKGConverter kilo = new TONToKGConverter();
            kilo.setFromValue(fromValue);
            kilo.convert();

            TONToGConverter gram = new TONToGConverter();
            gram.setFromValue(fromValue);
            gram.convert();

            System.out.println(fromValue +" " + originalMeasure + " to " + kilo.getConvertedValue() + " " + "KG");
            System.out.println(fromValue +" " + originalMeasure + " to " + gram.getConvertedValue() + " " + "G");    
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}
