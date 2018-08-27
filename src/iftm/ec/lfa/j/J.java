/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iftm.ec.lfa.j;

/**
 *
 * @author marco
 */
public class J {
    public static boolean avaliar(String s){
        char c;
        int e = 1;
        boolean erro = false;
        
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            
            switch(e){
                case 1:
                    if(c == '+' || c == '-') e = 2;
                    else e = 7;
                    break;
                case 2:
                    if(Character.isDigit(c)) e = 3;
                    else e = 7;
                    break;
                case 3:
                    if(c == 'e') e = 4;
                    else if(c == ',') e = 6;
                    else if(!Character.isDigit(c)) e = 7;
                    break;
                case 4:
                    if(c == '+' || c == '-') e = 5;
                    else e = 7;
                    break;
                case 5:
                    if(!Character.isDigit(c)) e = 7;
                    break;
                case 6:
                    if(!Character.isDigit(c)) e = 7;
                    break;
                case 7:
                    erro = true;
                    break;
            }
        }
        
        if(erro || (e != 3 && e != 6 && e!= 5)) return false;
        else return true;
        
    }
}
