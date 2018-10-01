/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung
 *                        nilai terbesar dan terkecil
 * @author Acer
 */
public class PBO210117043Latihan23nilaiterbesardanterkecil{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String petugas;
        int mhs;
        int besar;
        int kecil;
        int nilaimhs[]= new int[20];
        Scanner scn = new Scanner(System.in);
        System.out.println("=======Program Nilai Terbesar dan Terkecil Nilai" + "Mahasiswa======");
        System.out.print("masukkan nama petugas :");petugas = scn.next();
        System.out.print("masukkan banyaknya mahasiswa: ");mhs = scn.nextInt();
        besar = 0;
        kecil = 100;
        for (int i = 1;i <= mhs;i++){
            System.out.print("masukkan nilai mahasiswa ke-" +i+"=");
            nilaimhs[i] = scn.nextInt();
            besar = ((besar<=nilaimhs[i])?nilaimhs[i]:besar);
            kecil = ((kecil>=nilaimhs[i])?nilaimhs[i]:kecil);
            
        }
        System.out.println("\n"+"=======Hasil Nilai Mahasiswa=======");
        for(int i = 1; i <= mhs;i++){
            System.out.println("Nilai Mahasiswa Ke-"+i+"="+nilaimhs[i]);
            
        }
        System.out.print("\nNilai Terbesar adalah: " + besar);
        System.out.println("\nNilai Terkecil adalah: " + kecil);
        System.out.println("\n"+"Petugas :"+petugas );
        
        
    }
    
}
