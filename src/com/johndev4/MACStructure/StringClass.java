package com.johndev4.MACStructure;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

/**
 *
 * @author johndev4
 */
public class StringClass {
    
    private String string;
    
    StringClass() {
        string = "";
    }
    
    
    public void setText(String text) {
        this.string = text;
    }
    
    @Override
    public String toString() {
        return string;
    }
    
    public void clean() {
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < string.length(); i++){
            if (isDigit(string.charAt(i)) || isLetter(string.charAt(i))){
                temp.append(string.charAt(i));
            }
        }
        
        this.string = temp.toString();
    }
    
    
    public void toUpperCase() {
        string = string.toUpperCase();
    }
    
    public void toLowerCase() {
        string = string.toLowerCase();
    }
    
    
    public void addColon() {
        StringBuilder temp = new StringBuilder();
        int count = 0;
        
        for (int i = 0; i < string.length(); i++){
            if (count == 2){
                temp.append(':');
                count = 0; i--;
            } else{
                temp.append(string.charAt(i));
                count++;
            }
        }
        
        this.string = temp.toString();
    }
    
    public void removeColon() {
        StringBuilder temp = new StringBuilder();
        
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != ':')
                temp.append(string.charAt(i));
        }
        
        this.string = temp.toString();
    }
    
    
    public void enclose() {
        StringBuilder temp = new StringBuilder();
        temp.insert(0, "[");
        temp.append(this.string);
        temp.append("]");
        
        this.string = temp.toString();
    }
    
    public void disclose() {
        if (string.startsWith("[") && string.endsWith("]")){
            int len = this.string.length();
            this.string = this.string.substring(1, len-1);
        }
    }
}
