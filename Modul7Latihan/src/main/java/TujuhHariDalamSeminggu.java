/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class TujuhHariDalamSeminggu {
     public static void main(String[] args) {
        // Inisialisasi array untuk 7 hari dalam seminggu
        String[] days = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        // Menggunakan while-loop
        System.out.println("Menggunakan while-loop:");
        int i = 0; //Inisialisasi variabel i dengan nilai 0 sebagai index awal untuk pengulangan while-loop.
        while (i < days.length) { //Lakukan pengulangan while-loop selama nilai i kurang dari panjang array days.
            System.out.println(days[i]);
            i++;
        }
        
        // Menggunakan do-while-loop
        System.out.println("\nMenggunakan do-while-loop:");
        int j = 0;
        do { //do merupakan awal dari do-while loop. Loop ini akan mencetak nilai array days 
            System.out.println(days[j]); //System.out.println(days[i]); merupakan perintah untuk mencetak nilai array days pada index j.
            j++; //ji++; merupakan increment variabel j yang akan digunakan sebagai index array pada perulangan selanjutnya.
        } while (j < days.length); // while (j < days.length); merupakan kondisi untuk melakukan looping selama nilai 
                                   //variabel j masih kurang dari panjang array days.
        
        // Menggunakan for-loop
        System.out.println("\nMenggunakan for-loop:");
        for (int k = 0; k < days.length; k++) { //for (int k = 0; k < days.length; k++) merupakan awal dari for-loop. Loop ini akan mencetak nilai array 
                                                //days menggunakan block code yang diapit oleh {} hingga kondisi for terpenuhi.
            System.out.println(days[k]); //System.out.println(days[k]); merupakan perintah untuk mencetak nilai array days pada index k.
        }
    }
}
