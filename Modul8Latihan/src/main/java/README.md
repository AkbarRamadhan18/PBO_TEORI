Mencetak Argument :

Program ini merupakan contoh penggunaan argumen command line pada Java. Program ini akan menerima argumen dari user melalui command line dan mencetak semua argumen yang diberikan ke layar.

Cara Penggunaan 
Untuk menggunakan program ini, ikuti langkah-langkah berikut:

1. Buka command prompt atau terminal di komputer Anda.
2. Masuk ke direktori di mana file MencetakArgument.java disimpan.
3. Compile program dengan menjalankan perintah javac MencetakArgument.java.
4. Jalankan program dengan menjalankan perintah java MencetakArgument <argumen>, di mana <argumen> adalah argumen yang ingin Anda berikan kepada program. Anda bisa memberikan lebih dari satu argumen dengan memisahkan setiap argumen dengan spasi.
5. Program akan mencetak semua argumen yang diberikan ke layar.



Program Operasi Aritmatik

Program ini menerima dua argumen bilangan dari command line dan melakukan operasi aritmatika dasar pada kedua bilangan tersebut. Hasil operasi tersebut dicetak ke layar.

Cara Menjalankan Program
Pastikan sudah terinstall JDK (Java Development Kit) di komputer Anda.

Buka terminal atau command prompt.

Masuk ke direktori tempat file program berada.

Penjelasan Kode :

1. public class OperasiAritmatik : Mendefinisikan kelas OperasiAritmatik.
2. public static void main(String[] args) : Metode utama yang akan dieksekusi oleh JVM.
3. if (args.length != 2) : Pemeriksaan apakah jumlah argumen yang diberikan sama dengan 2. Jika tidak sama dengan 2, maka akan dicetak pesan error dan program akan dihentikan menggunakan perintah return.
4. int num1 = Integer.parseInt(args[0]); : Mengubah string yang mewakili bilangan menjadi bilangan integer menggunakan metode parseInt() dari kelas Integer.
5. int num2 = Integer.parseInt(args[1]); : Mengubah string yang mewakili bilangan menjadi bilangan integer menggunakan metode parseInt() dari kelas Integer.
5. int sum = num1 + num2; : Melakukan operasi penjumlahan pada dua bilangan tersebut. Hasil operasi disimpan pada variabel sum.
6. int difference = num1 - num2; : Melakukan operasi pengurangan pada dua bilangan tersebut. Hasil operasi disimpan pada variabel difference.
7. int product = num1 * num2; : Melakukan operasi perkalian pada dua bilangan tersebut. Hasil operasi disimpan pada variabel product.
8. int quotient = num1 / num2; : Melakukan operasi pembagian pada dua bilangan tersebut. Hasil operasi disimpan pada variabel quotient.
9. System.out.println("sum = " + sum); : Mencetak hasil operasi penjumlahan ke layar.
10. System.out.println("difference = " + difference); : Mencetak hasil operasi pengurangan ke layar.
11. System.out.println("product = " + product); : Mencetak hasil operasi perkalian ke layar.
12. System.out.println("quotient = " + quotient); : Mencetak hasil operasi pembagian ke layar.