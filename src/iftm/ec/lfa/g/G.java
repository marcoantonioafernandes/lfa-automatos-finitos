/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.g;

/**
 *
 * @author vinicius
 */
public class G {
    
    public static boolean avaliar(String s){
        char c;
        int e = 1;
        boolean erro = false;
        
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            
            switch(e){
                case 1:
                    if(c == 'a') e = 2;
                    else if(c == 'b') e = 4;
                    else erro = true;
                    break;
                case 2:
                    if(c == 'a') e = 3;
                    else if(Character.isAlphabetic(c) && Character.isLowerCase(c))
                        e = 2;
                    else erro = true;
                    break;
                case 3:
                    if(c == 'a') e = 2;
                    else if(Character.isAlphabetic(c) && Character.isLowerCase(c))
                        e = 3;
                    else erro = true;
                    break;
                case 4:
                    if(c == 'b') e = 5;
                    else if(Character.isAlphabetic(c) && Character.isLowerCase(c))
                        e = 4;
                    else erro = true;
                    break;
                case 5:
                    if(c == 'b') e = 4;
                    else if(Character.isAlphabetic(c) && Character.isLowerCase(c))
                        e = 5;
                    else erro = true;
                    break;
            }
        }
        
        if(erro || (e != 3 && e != 4)) return false;
        else return true;
        
    }
    
}
