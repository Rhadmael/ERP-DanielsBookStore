/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CommonFiles;

import java.util.StringTokenizer;

/**
 *
 * @author kiddabove
 */
public class Validations {
    public boolean isString(String val){
        boolean value = false;
        char CharInString[] = val.toCharArray();
        for(char c :CharInString){
            if( !Character.isLetter(c)){
                value = false;
            }
            else
                value = true;
            
        }
        return value;
}
        
    
    public boolean isNumber(String val){
        boolean value = false;
        char CharInString[] = val.toCharArray();
        for(char c :CharInString){
            if( !Character.isDigit(c)){
                value = false;
            }
            else
                value = true;
            
        }
        return value;
}
    public boolean isEmail(String  val){
        char emailChars[] = val.toCharArray();
        int AtPosition =0;
        int periodPosition =0;
        for(int a=0; a<val.length(); a++){
            if(emailChars[a] == '@'){
                AtPosition = a;
            }
            else if(emailChars[a] == val.lastIndexOf(".")){
                periodPosition = a;
            }
        }
        if(AtPosition<periodPosition){
            return true;
        }
        else
            return false;
        
        
    }
    public boolean isProperPassword(String  val){
        boolean value = false;
        
        return value;
    }
}
