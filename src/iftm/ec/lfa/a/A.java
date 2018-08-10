/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.a;

/**
 *
 * @author vinicius
 */
public class A {
    
    public static boolean avaliar(String s) {
        char c;
        int e = 1;
        boolean erro = false;
        
        for(int i = 0; i < s.length() && !erro; i++) {
            switch(c = s.charAt(i)) {
                case 1:
                    if(c == 'a') e = 2;
                    else erro = true;
                    break;
                  
                case 2:
                    if (c == 'a') e = 2;
                    else if (c == 'b') e = 3;
                    else erro = true;
                    break;
                    
                case 3:
                    if (c == 'a') e = 2;
                    else if (c == 'b') e = 3;
                    else erro = true;
                    break;
            }
        }
        
        if(erro || (e != 3)) {
            return false;
        } else {
            return true;
        }
    }
    
}
