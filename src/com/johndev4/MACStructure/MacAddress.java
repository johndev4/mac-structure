package com.johndev4.MACStructure;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

/**
 *
 * @author johndev4
 */
public class MacAddress extends Formatter {
    
    protected static String addr;
    public final static String ERROR_MESSAGE = "ErrorMessage: String text is not Mac Address";
    
    MacAddress() {
        addr = "000000000000";
    }
    
    
    public void setText(String text) {
        text = text.trim();
        
        if (isMacAddress(text)){
            addr = text;
        } else{
            addr = ERROR_MESSAGE;
        }
    }
    
    @Override
    public String toString() {
        return addr;
    }
    
    
    
    private boolean isMacAddress(String ad){
        return length(ad) == 12 && charactersAreQualified(ad);
    }
    
    private int length(String ad) {
        int count = 0;
        
        for (int i = 0; i < ad.length(); i++){
            if(isDigit(ad.charAt(i)) || isLetter(ad.charAt(i)))
                count++;
        }
        
        return count;
    }
    
    private boolean charactersAreQualified(String ad) {
        boolean digitOrLetter = true;
        boolean colon = true;
        
        
        if (ad.contains(":")){
            if (ad.startsWith("[") && ad.endsWith("]")){
                if (
                        ad.charAt(3) == ':'
                        && ad.charAt(6) == ':'
                        && ad.charAt(9) == ':'
                        && ad.charAt(12) == ':'
                        && ad.charAt(15) == ':'
                        ){
                    colon = true;

                } else{
                    colon = false;
                }

            } else{
                if (
                        ad.charAt(2) == ':'
                        && ad.charAt(5) == ':'
                        && ad.charAt(8) == ':'
                        && ad.charAt(11) == ':'
                        && ad.charAt(14) == ':'
                        ){
                    colon = true;
                } else{
                    colon = false;
                }
            }
        }

        for (int i = 0; i < ad.length(); i++){
            
            if (isDigit(ad.charAt(i)) || isLetter(ad.charAt(i))){
                digitOrLetter = true;
                
            } else{
                if (ad.charAt(i) != ':' && !ad.startsWith("[") && !ad.endsWith("]")){
                    digitOrLetter = false;
                    break;
                }
            }
        }
        
        return digitOrLetter && colon;
    }
    
    
    /*
     * Start date: July 22, 2019 Time: 6:27pm
     * End date: July 26, 2019 Time: 1:09am
    */
}
