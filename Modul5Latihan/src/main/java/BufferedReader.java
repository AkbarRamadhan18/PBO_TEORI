/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Azzammil Akbar Ramadhan
 */

import java.io.BufferedReader;//Ini adalah sintaks untuk mengimport kelas BufferedReader 
                              //dari paket java.io. Kelas ini digunakan untuk membaca input 
                              //dari pengguna melalui command line.
import java.io.IOException;//Ini adalah sintaks untuk mengimport kelas IOException dari paket 
                           //java.io. Kelas ini digunakan untuk menangani kesalahan input-output pada program.
import java.io.InputStreamReader;//ni adalah sintaks untuk mengimport kelas InputStreamReader dari paket java.io. 
                                //Kelas ini digunakan untuk membaca karakter dari input stream.

public class BufferedReader {
     public static void main(String[] args) { //Ini adalah sintaks untuk mendefinisikan metode main. 
                                              //Metode main adalah titik masuk dari program Java.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Ini adalah sintaks untuk membuat objek BufferedReader yang 
        //digunakan untuk membaca input dari pengguna. Objek tersebut dibuat dengan menggunakan objek
        //InputStreamReader sebagai argumen untuk konstruktor BufferedReader, 
        //dan objek System.in sebagai argumen untuk konstruktor InputStreamReader.

        try {//try { ... } catch (IOException e) { ... }: Ini adalah sintaks untuk menangani kesalahan 
            //input-output yang dapat terjadi pada program. Dalam blok try, 
            //program meminta pengguna untuk memasukkan tiga kata secara berurutan, dan menangkap input pengguna 
            //menggunakan BufferedReader. Jika terjadi kesalahan saat membaca input, 
            //program akan menjalankan blok catch dan menampilkan pesan kesalahan.
            
            System.out.print("Enter word1: ");//ni adalah sintaks untuk menampilkan pesan permintaan input 
                                                //kepada pengguna di command line.
                                                
            String word1 = reader.readLine();//Ini adalah sintaks untuk membaca input pengguna menggunakan objek BufferedReader. 
                                             //Input yang dimasukkan oleh pengguna akan disimpan dalam variabel word1.

            System.out.print("Enter word2: ");
            String word2 = reader.readLine();

            System.out.print("Enter word3: ");
            String word3 = reader.readLine();

            System.out.println(word1 + " " + word2 + " " + word3);// Ini adalah sintaks untuk menampilkan output ke layar. 
                                                                //Output tersebut adalah tiga kata yang dimasukkan oleh pengguna 
                                                                //secara berurutan,dengan setiap kata dipisahkan oleh satu spasi.
        } catch (IOException e) {
            System.out.println("Error reading input from user");
            e.printStackTrace();
        }
    }
}
