/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.d;

/**
 *
 * @author marco
 */
public class D {
    
    public static boolean avaliar(String s){
        char c;
        int e = 1;
        boolean erro = false;
        
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            
            switch(e){
                case 1:
                    if(c == 'b') e = 2;
                    else if(c != 'a') e = 9;
                    break;
                case 2:
                    if(c == 'a') e = 3;
                    else if(c != 'b') e = 9;
                    break;    
                case 3:
                    if(c == 'b') e = 4;
                    else if(c == 'a') e = 1;
                    else e = 9;
                    break;
                case 4:
                    if(c == 'a') e = 5;
                    else if(c == 'b') e = 2;
                    else e = 9;
                    break;
                case 5:
                    if(c == 'b') e = 6;
                    else if(c != 'a') e = 9;
                    break;
                case 6:
                    if(c == 'a') e = 7;
                    else if(c != 'b') e = 9;
                    break;
                case 7:
                    if(c == 'a') e = 5;
                    else if(c == 'b') e = 8;
                    else e = 9;
                    break;
                case 8:
                    if(c == 'b') e = 6;
                    else e = 9;
                    break;
                case 9:
                    erro = true;
                    break;
            }
        }
        
        if(erro || (e == 9)) return false;
        else return true;
        
    }
    
}
