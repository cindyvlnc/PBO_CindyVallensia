/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_mi202;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class lat1 {
private String barang;
private int jumlah;

public void setbarang(String nama) {
barang = nama;
}
public String getbarang() {
return barang;
}
public void setjumlah(int jml) {
jumlah = jml;
}
public int getjumlah() {
return jumlah;
}
public static void main (String [ ] args) {
//TODO code aplication logic here
lat1 demo = new lat1() ;
demo.setbarang("Laptop") ;
demo.setjumlah(1) ;
System.out.println("nama : "+demo.getbarang());
System.out.println("jumlah : " + demo.getjumlah());
}
}
