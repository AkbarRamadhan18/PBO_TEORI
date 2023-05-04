PENJELASAN KODE PROGRAM MODUL

Kode program MODUL 6.1 meminta pengguna untuk memasukkan tiga nilai bilangan bulat dan menghitung rata-ratanya. Ini kemudian menampilkan rata-rata bersama dengan emotikon yang mewakili ekspresi pengguna berdasarkan nilai rata-rata.

Program dimulai dengan mendeklarasikan empat variabel integer dan tiga variabel string. Variabel string digunakan untuk menyimpan nilai input, pesan terakhir, dan emotikon. Variabel integer digunakan untuk menyimpan nilai input yang dikonversi dan rata-rata.

Program kemudian meminta pengguna untuk memasukkan nilai pertama menggunakan kotak dialog JOptionPane dan menetapkan nilai ke variabel input1. Proses yang sama diulangi untuk nilai kedua dan ketiga, yang masing-masing ditetapkan ke variabel input2 dan input3.

Selanjutnya, program mengubah nilai masukan dari string menjadi bilangan bulat menggunakan metode parseInt dan menugaskannya ke variabel a, b, dan c.

Program menghitung rata-rata dengan menjumlahkan a, b, dan c, lalu membagi hasilnya dengan tiga. Hasilnya ditugaskan ke variabel rata.

Program kemudian memeriksa nilai variabel rata. Jika nilainya lebih besar dari 60, variabel senyum akan ditetapkan ke ":D", yang mewakili emotikon wajah smiley. Jika tidak, senyum akan berubah menjadi ":(", yang merupakan emoticon wajah sedih.

Pesan terakhir kemudian dibangun menggunakan rangkaian string dan ditampilkan menggunakan kotak dialog JOptionPane. Ini termasuk nilai input, rata-rata yang dihitung, dan emotikon.

----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.2 IF ELSE

Kode tersebut adalah program Java sederhana yang meminta pengguna untuk memasukkan bilangan bulat dan memeriksa apakah angka yang dimasukkan antara 1 dan 10 (inklusif) atau tidak menggunakan pernyataan if-else. Jika nomornya antara 1 dan 10, itu mencetak "Nomor yang valid". Jika tidak, itu mencetak "Nomor Tidak Valid".

Berikut adalah cara kerja program:

Pengguna diminta untuk memasukkan bilangan bulat melalui kotak dialog menggunakan showInputDialogmetode kelas JOptionPane. Input disimpan dalam angkavariabel sebagai string. Nilai string diubah menjadi bilangan bulat menggunakan valueOfmetode kelas Integerdan ditugaskan ke zvariabel. Variabel hasilstring diinisialisasi dengan string kosong. Pernyataan if-else memeriksa apakah nilai zantara 1 dan 10 (inklusif). Jika kondisinya benar, hasilvariabel diperbarui dengan pesan "Valid number". Jika kondisi salah, hasilvariabel diperbarui dengan pesan "Invalid Number". Terakhir, kotak dialog ditampilkan dengan pesan di dalam hasilvariabel.

Catatan: Program mengasumsikan bahwa pengguna memasukkan bilangan bulat yang valid. Jika pengguna memasukkan input non-numerik, program akan menampilkan NumberFormatExceptionkesalahan.

----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.2 SWITCH

Penjelasan kode PROGRAM MODUL 6.2 adalah sebagai berikut: Baris pertama mendeklarasikan nama kelas "Latihan62Switch". Baris kedua mendeklarasikan metode main sebagai titik awal program. Baris ketiga mendeklarasikan variabel "angka" sebagai string dan memberikan input dari pengguna melalui dialog input JOptionPane. Baris keempat mendeklarasikan variabel "z" sebagai integer dan mengkonversi input string "angka" menjadi integer. Baris kelima mendeklarasikan variabel "hasil" sebagai string. Baris keenam mengaktifkan struktur switch-case yang akan melakukan pengujian pada variabel "z". Baris ketujuh hingga kedua belas mendeklarasikan kondisi ketika variabel "z" sama dengan 1 hingga 10, dan menambahkan string "Valid Number" pada variabel "hasil". Baris ketigabelas mendeklarasikan kondisi default ketika variabel "z" tidak sama dengan angka 1 hingga 10, dan menambahkan string "Invalid Number" pada variabel "hasil". Baris keempatbelas menampilkan variabel "hasil" melalui dialog output JOptionPane.

Kode tersebut memiliki fungsi untuk mengecek apakah angka yang dimasukkan oleh pengguna merupakan angka yang valid atau tidak dengan menggunakan struktur switch-case pada variabel "z". Jika angka yang dimasukkan berada pada rentang 1 hingga 10, maka akan ditampilkan "Valid Number" pada output. Jika angka tidak berada pada rentang tersebut, maka akan ditampilkan "Invalid Number" pada output.

-----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.3 DO WHILE

Kode program MODUL 6.3 adalah program Java yang menampilkan teks "Azzammil Akbar Ramadhan" sebanyak 100 kali menggunakan struktur perulangan do-while.

Penjelasan kode di atas adalah sebagai berikut:

Baris pertama mendeklarasikan nama kelas "Latihan63DoWhile". Baris kedua mendeklarasikan metode main sebagai titik awal program. Baris ketiga mendeklarasikan variabel integer "r" dengan nilai awal 0. Baris keempat membuka blok perulangan do-while dengan kondisi bahwa teks "DELLA PUTRI HERMAN" akan terus ditampilkan selama nilai "r" kurang dari 100. Baris kelima menampilkan teks "DELLA PUTRI HERMAN". Baris keenam menambahkan nilai variabel "r" sebanyak 1 setiap kali perulangan dijalankan. Baris ketujuh menutup blok perulangan do-while. Kode berakhir dengan kurung kurawal yang menutup metode main dan kelas. Program ini akan menampilkan teks "DELLA PUTRI HERMAN" sebanyak 100 kali pada output console. Hal ini terjadi karena perulangan do-while akan terus dijalankan hingga nilai "r" mencapai 100, dan pada setiap iterasi, teks "DELLA PUTRI HERMAN" akan ditampilkan pada layar.

-----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.3 FOR LOOP

Kode program MODUL 6.3 adalah program Java yang menggunakan perulangan for untuk mencetak string "DELLA PUTRI HERMAN" sebanyak 100 kali. Berikut adalah rincian kodenya: public class Latihan63ForLoop { public static void main(String args[]) { int r; for (r = 0; r < 100; r++) { System.out.println("DELLA PUTRI HERMAN"); } } }

public class Latihan63ForLoopmendefinisikan kelas publik bernama Latihan63ForLoop. public static void main(String args[])adalah metode utama yang dijalankan saat program dijalankan. int r;mendeklarasikan variabel integer bernama r. for (r = 0; r < 100; r++)memulai loop for yang diinisialisasi rke 0, mengeksekusi loop selama rkurang dari 100, dan bertambah r1 setelah setiap iterasi. System.out.println("DELLA PUTRI HERMAN");mencetak string "DELLA PUTRI HERMAN" ke konsol. }menutup for loop. }menutup metode utama. }menutup kelas.

-----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.3 WHILE LOOP

Kode program MODUL 6.3 menunjukkan contoh program Java yang menggunakan while loop untuk mencetak string “DELLA PUTRI HERMAN” sebanyak 100 kali.

Perulangan while diinisialisasi dengan variabel penghitung "r" yang disetel ke 0 di awal. Perulangan while kemudian memeriksa kondisi "r<100" dan mengeksekusi blok kode di dalam perulangan jika kondisinya benar.

Blok kode di dalam loop mencetak string "Azzammil AKbar Ramadhan" menggunakan pernyataan "System.out.println()" dan kemudian menambah nilai variabel penghitung "r" sebesar 1.

Perulangan terus dijalankan selama kondisi "r<100" benar, yang berarti perulangan akan dijalankan 100 kali sebelum keluar.

----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.4 DO WHILE

Kode program modul 6.4 ini meminta pengguna untuk memasukkan angka dan eksponennya, lalu menghitung hasil penaikan angka menjadi eksponen menggunakan do-while loop.

Pertama, program menggunakan kelas Pemindai untuk membaca dalam dua bilangan bulat dari pengguna - bilangan dasar dan eksponen. Ini kemudian menginisialisasi dua variabel integer lagi, idan h, menjadi 1.

Selanjutnya, program memasuki perulangan do-while yang berjalan selama variabel ilebih kecil dari eksponen. Selama setiap iterasi dari loop, program mengalikan nilai hdengan bilangan dasar dan penambahan i. Ini berlanjut sampai itidak kurang dari eksponen.

Terakhir, program mencetak hasil dari menaikkan angka menjadi eksponen.

----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.4 FOR LOOP

Kode program MODUL 6.4 adalah program Java yang menghitung kekuatan angka menggunakan loop for.

Program dimulai dengan meminta pengguna untuk memasukkan dua bilangan bulat: bilangan dasar dan eksponen (atau pangkat). Program kemudian mendeklarasikan dan menginisialisasi variabel hke 1.

Perulangan for kemudian dijalankan, dimulai dengan isama dengan 1 dan berlanjut hingga ikurang dari eksponen pkt. Dalam setiap iterasi, nilai dari hdiperbarui dengan mengalikannya dengan bilangan dasar nilai.

Setelah perulangan selesai, program akan mencetak hasilnya, yang merupakan nilai dari h, bersama dengan bilangan dasar dan eksponen awal.

Program ini setara dengan program sebelumnya (Latihan64DoWhile), yang menggunakan perulangan do-while untuk menghitung pangkat suatu bilangan.

----------------------------------------------------------------------------------------------------------------------------------------------------
README MODUL 6.4 WHILE LOOP

Kode program MODUL 6.4 ini adalah program Java yang menghitung kekuatan angka yang diberikan menggunakan while loop.

Inilah cara kerjanya:

Program dimulai dengan mengimpor kelas Pemindai untuk membaca masukan dari pengguna. Itu meminta pengguna untuk memasukkan nomor dan menyimpan nilai dalam variabel "input". Ini kemudian meminta pengguna untuk memasukkan kekuatan dan menyimpan nilai dalam variabel "pangkat". Ini menginisialisasi variabel "i" dan "h" ke 1. Ini kemudian memulai loop sementara yang berjalan selama "i" kurang dari "pangkat". Di dalam loop, ini mengalikan nilai "h" dengan "input". Itu menambah nilai "i" dengan 1 di setiap iterasi loop. Setelah perulangan selesai, program menampilkan hasil "input" yang dipangkatkan "pangkat" dengan menggunakan variabel "h".
