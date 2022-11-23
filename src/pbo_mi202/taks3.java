/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_mi202;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
//Parent
class NewCultureTecnology { //level 1
	public void BoyGroup() {
		System.out.println("Annyeonghaseyo, NCT NewCultureTecnology Imninda");
	}
}

class NCTDream extends NewCultureTecnology {
	public void Subunit() {
		System.out.println("Annyeonghaseyo, NCT Dream Imninda Sub Unit from NCT");
	}
}

class NCT127 extends NewCultureTecnology {
	public void Subunit() {
		System.out.println("Annyeonghaseyo, NCT127 Imninda Sub Unit from NCT");
	}
}

class Mark extends NCTDream{
	public void membergroup() {
		System.out.println("I'm Mark Leader NCTDream");
	}
}

class Taeyong extends NCT127{
	public void membergroup() {
		System.out.println("I'm Taeyong Leader NCTDream");
	}
}


class Task3 {
  public static void main(String args[]){
    Mark mark = new Mark();
    Taeyong taeyong = new Taeyong();
    Scanner input = new Scanner(System.in);
    int n,i;
    mark.BoyGroup();
    System.out.println("Sub Unit NCT");
    System.out.println("1. NCT Dream");
    System.out.println("2. NCT 127");
    System.out.print("Masukkan pilihan :");
    n = input.nextInt();
    if (n == 1)
    {
        mark.Subunit();
        for (i=0;i<5;i++)
        {
            mark.membergroup();
        }
      }
    else
    {
        taeyong.Subunit();
        for (i=0;i<5;i++)
        {
            taeyong.membergroup();
        }
      }
}}