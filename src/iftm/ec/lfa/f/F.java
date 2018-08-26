/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.f;

/**
 *
 * @author marco
 */
public class F {
    
    public static boolean avaliar(String s){
        char c;
        int e = 1;
        boolean erro = false;
        
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            
            switch(e){
                case 1:
                    if(c == 'a') e = 2;
                    else if(e != 'a') e = 5;
                    break;
                case 2:
                    if(c == 'a') e = 1;
                    else if(c == 'b') e = 3;
                    else erro = true;
                    break;
                case 3:
                    if(c == 'b') e = 4;
                    else if(c == 'a') e = 5;
                    break;
                case 4:
                    if(c == 'b') e = 3;
                    else if(c == 'a') e = 5;
                    else erro = true;
                    break;
                case 5:
                    erro = true;
                    break;
            }
        }
        
        if(erro || (e != 2 && e != 4)) return false;
        else return true;
        
    }
    
}
