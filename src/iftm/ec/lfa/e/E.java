/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.e;

/**
 *
 * @author vinicius
 */
public class E {
    
    public static boolean avaliar(String s) {
        char c;
        int e = 1;
        boolean erro = false;
        for(int i = 0; i < s.length() && !erro; i++) {
            c = s.charAt(i);
            switch(e) {
                case 1:
                    if(c == 'a') e = 1;
                    else if (c == 'b') e = 2;
                    else erro = true;
                    break;
                  
                case 2:
                    if (c == 'a') e = 3;
                    else if (c == 'b') e = 2;
                    else erro = true;
                    break;
                    
                case 3:
                    if (c == 'b') e = 4;
                    else if (c == 'a') e = 1;
                    else erro = true;
                    break;
                
                case 4:
                    if (c == 'a') e = 5;
                    else if (c == 'b') e = 2;
                    else erro = true;
                    break;
                    
                case 5:
                    erro = true;
                    break;
                    
                
            }
        }
        
        if(erro || (e != 1 && e != 2 && e != 3 && e != 4)) {
            return false;
        } else {
            return true;
        }
    }
    
}
