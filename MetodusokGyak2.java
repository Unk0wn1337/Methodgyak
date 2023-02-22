package com.mycompany.metodusokgyak2;

public class MetodusokGyak2 {
    
    public static void main(String[] args) {
        osszesen();
    
    
    }
    
    private static void osszesen() {
        elso();
        masodik();
        harmadik();
    }

    private static void elso() {
        int osszeg = Elso10SzamOsszege();
        String s = String.format("Az első 10 szám összege: " + osszeg);
        kiir(s);
    }


    
    private static void masodik() {
        int a = 3, b = 6, c = 7, d = 9;
        int osszeg = negySzam(a, b, c, d);
        String s = String.format("%d + %d + %d + %d = %d", a, b, c, d, osszeg);
        kiir(s);
    }

     private static void harmadik() {
        int a = 3, b = 6;
        int osszeg = ketSzam(a, b);
        String s = String.format("%d + %d = %d", a, b, osszeg);
        kiir(s);
    }
    
    
    
    private static int Elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }
    
    private static int ketSzam(int a, int b) {
        return a + b;
    }
    
    
    private static int negySzam(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    
    private static void kiir(String str){
        System.out.println(str);
    }
}   