/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CindyVallensia_Modul5;

/**
 *
 * @author satri
 */
import javax.swing.JOptionPane;

public class lat2 {
    public static void main( String[] args ){ 
    String name = "";
    name = JOptionPane.showInputDialog("Please enter your name"); 

    String mes = "Hello " + name + "!"; 

    JOptionPane.showMessageDialog(null, mes); 

 }
}
