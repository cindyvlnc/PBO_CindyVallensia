/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_mi202;

/**
 *
 * @author ASUS
 */import java.util.Scanner;
public class Taks4 {
 
    // Method sama namun parameter berbeda 
    // Tipe data double
    static double kec (double t, double g, double vo) {
        double vt;
        if (vo == 0) {
            System.out.println("Kecepatan benda jatuh bebas");
            vt = ( g * t );
        }else{
            System.out.println("Kecepatan benda gerak vertikal kebawah");
            vt = vo + ( g * t );
        } 
        return vt;
    }
 
    // Method sama, namun parameter berbeda
    // Tipe data int
    static int kec (int t, int g, int vo) {  
      int vt;
      if (vo == 0) {
            System.out.println("Kecepatan benda jatuh bebas");
            vt = ( g * t );
        }else{
            System.out.println("Kecepatan benda gerak vertikal kebawah");
            vt = vo + ( g * t );
        } 
        return vt;
    }
    
 
    public static void main(String[] argrs) {
        Scanner in = new Scanner(System.in);
        
        System.out.println(kec(5, 9.8, 7.4));
        System.out.println(kec(5.2, 9.8, 0));
        System.out.println(kec(5, 10, 7));
        System.out.println(kec(5, 10, 0));
    }
 
}
