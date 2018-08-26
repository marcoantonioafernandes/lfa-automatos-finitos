/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.h;

/**
 *
 * @author marco
 */
public class H {
    
    public static boolean avaliar(String s){
        int c;
        int e = 1;
        boolean erro = false;
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)))
                c = Character.getNumericValue(s.charAt(i));
            else{
                erro = true;
                break;
            }
            
            switch(e){
                case 1:
                    if(c == 0 || c == 1) e = 2;
                    else e = 4;
                    break;
                case 2:
                    if(c%2 != 0) e = 3;
                    break;
                case 3:
                    if(c%2 != 0) e = 2;
                    break;
                case 4:
                    erro = true;
                    break;
            }
        }
        
        if(erro || (e != 2)) return false;
        else return true;
        
    }
    
}
