package com.johndev4.MACStructure;

/**
 *
 * @author johndev4
 */
public class Formatter {
    
    /*
     * Return formatted Mac Address which define by the parameters. If uppercase is set to true, then all letters in the
     * string will be set to uppercase. If colon is set to true, then colon will be added to string for each 2 characters.
     * If brackets is set to true, then the string will be enclosed by the square brackets.
     * Parameters:
     *      * boolean upperCase - state of letter case
     *      * boolean colon - state of with / without colon
     *      * boolean upperCase - state of enclosed with squared brackets or not
    */
    public String format(boolean upperCase, boolean colon, boolean brackets) {
        StringClass str = new StringClass();
        str.setText(MacAddress.addr);
        str.clean();
        
        if (upperCase){
            str.toUpperCase();
        } else{
            str.toLowerCase();
        }
        
        if (colon){
            str.addColon();
        } else{
            str.removeColon();
        }
        
        if (brackets){
            str.enclose();
        } else{
           str.disclose();
        }
        
        return str.toString();
    }
}
