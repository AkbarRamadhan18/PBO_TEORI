/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class BukuAlamat {
    public static void main(String[] args) {
        
        String[][] entry = {{"Florence", "735-1234", "Manila"}, 
                    {"Joyce", "983-3333", "Quezon City"}, 
                    {"Becca", "456-3322", "Manila"}};
                    //Deklarasi variabel entry sebagai array 2 dimensi yang menyimpan data buku alamat.
                    //Inisialisasi array entry dengan data buku alamat.
                    //Perulangan for untuk mencetak setiap data dalam array entry.
                    
    for(int i=0; i<entry.length; i++){
      System.out.println("Name : " + entry[i][0]); //Mencetak nama dengan format "Name : " diikuti oleh nilai dari array entry pada index ke-i dan index 0 (kolom pertama).
      System.out.println("Tel. # : " + entry[i][1]);//Mencetak nomor telepon dengan format "Tel. # : " diikuti oleh nilai dari array entry pada index ke-i dan index 1 (kolom kedua).
      System.out.println("Address : " + entry[i][2]);//Mencetak alamat dengan format "Address : " diikuti oleh nilai dari array entry pada index ke-i dan index 2 (kolom ketiga).
      System.out.println();//Mencetak karakter untuk membuat baris baru pada setiap data.
    }
  }
}

