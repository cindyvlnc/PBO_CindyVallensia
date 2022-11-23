/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_mi202;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.Scanner;
 
class overloading{
 
    static int add(int a, int b)
    {
      return a * b;
    }
 
    static int add(int a, int b, int c)
    {
        return a * b / c;
    }
 
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,s,t,a;
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("Pilih bangun datar : ");
        n = in.nextInt();
        
        switch (n){ 
            case 1 :
        System.out.println("Masukkan Panjang Sisi Persegi :");
        s = in.nextInt();
        System.out.println("Luas Persegi :");
        System.out.println(add(s, s));break;
       
                case 2 :
        System.out.println("Masukkan Panjang Alas Segitinga :");
        a = in.nextInt();
        System.out.println("Masukkan Tinggi Segitinga :");
        t = in.nextInt();
        System.out.println("Luas Segitiga :");
        System.out.println(add(a, t, 2));break;
    }
}
}