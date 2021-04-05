/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

import java.util.Scanner;

/**
 *
 * @author surip8
 */
public class no_2 {
   public static void main(String[] args) {
      String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Tesla"};
      boolean ketemu = false;
        
        
        
        System.out.println("** Secuential Search **");
        System.out.println();
        
        
        
        System.out.print("Isi data adalah: | ");
        for(int i=0; i < data.length; i++){
            System.out.print(data[i] + " | ");
        }
        System.out.println();
        
        
        
        System.out.print("Masukkan data yang dicari: ");
        Scanner masukan = new Scanner(System.in);
        String cari = masukan.nextLine();
        
        
        
        for(int i=0; i<data.length; i++){
            if(cari.equalsIgnoreCase(data[i])){
                System.out.println("Data " + cari + " berada pada index ke-" + i);
                ketemu = true;
                break;
            }
        }
        
        
        
        if(!ketemu){
            System.out.println("data tidak ditemukan");
        }
        
        
        
        System.out.println();
        System.out.println("Mohammad Roihannudin ");
     
    } 
}
