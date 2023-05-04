/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
//Import beberapa kelas yang diperlukan dalam program.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class NomorTerbesar {
     public static void main(String[] args) throws IOException {
    int[] numbers = new int[10];//Membuat array integer dengan panjang 10 yang akan menampung angka yang dimasukkan oleh pengguna.

    //Membuat BufferedReader dan JOptionPane.
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < 10; i++) {
      String input = JOptionPane.showInputDialog("Masukkan angka ke-" + (i + 1));
      numbers[i] = Integer.parseInt(input);
    }
    
    //Menggunakan loop for untuk meminta input angka dari pengguna menggunakan JOptionPane dan menyimpannya dalam array numbers.
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];//Mencari nilai terbesar dari array numbers menggunakan loop for dan menyimpannya dalam variabel max.  
      }
    }
    //Menampilkan nilai terbesar menggunakan JOptionPane.
    JOptionPane.showMessageDialog(null, "Angka terbesar adalah " + max);
  }
}
