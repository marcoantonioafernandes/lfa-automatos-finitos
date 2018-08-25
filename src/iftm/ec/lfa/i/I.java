/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.i;

/**
 *
 * @author vinicius
 */
public class I {
    
     public static boolean avaliar(String s) {
        char c;
        int e = 1;
        boolean erro = false;
        for(int i = 0; i < s.length() && !erro; i++) {
            c = s.charAt(i);
            
            switch(e) {
                case 1:
                    if(Character.isLetter(c) && Character.isLowerCase(c)) e = 2;
                    else erro = true;
                    break;
                  
                case 2:
                    if (Character.isDigit(c)) break;
                    else if (Character.isLetter(c)) {
                        if(Character.isLowerCase(c)) break;
                        else erro = true;
                    }
                    else erro = true;
                    break;   
                
            }
        }
        
        if(erro || (e != 2)) {
            return false;
        } else {
            return true;
        }
    }
    
}
