package com.mycompany.metodusokgyak2;

import java.util.Random;

public class Equalizer {
    
    private static  Random rnd = new Random();
    
    public static void main(String[] args) {
        equalizer_5_Sorbol();
        
    }
    private static void equalizer_5_Sorbol(){
          eq();
          eq(12);
          eq();
          eq(8, true);
          eq(true);
        
                
        
    
    }
    private static void eq() {
        
        eq(false);           
        
    }
    private static void eq(boolean kiir) {
        int db = rnd.nextInt(3,8);
        eq(db, kiir);           
        
    }
    private static void eq(int hossz) {
        
        eq(hossz, false);           
        
    }
    private static void eq(int hossz,boolean kiir){
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + "*");
        }        
        if(kiir)
            System.out.print("\u001B[40m"+"("+(hossz)+")");
        
        System.out.println("");
    }
}   