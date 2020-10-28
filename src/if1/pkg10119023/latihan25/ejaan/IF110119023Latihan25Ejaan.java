/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan25.ejaan;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program :
 *
 */
import java.util.Scanner;
public class IF110119023Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scan.next();
        
        //split string ke array char
        String[] huruf = nama.split("");
        int i = 1;
        
        System.out.println("Ejaan untuk \""+nama+"\" adalah :");
        
        for (String eja : huruf){
            System.out.println("Huruf ke-"+i+" : "+eja);
            i++;
        }
    }

}
