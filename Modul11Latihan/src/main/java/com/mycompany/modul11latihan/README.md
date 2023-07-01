  # Student Class

Repositori ini berisi contoh penggunaan pewarisan (inheritance) dalam pemrograman Java menggunakan kelas `Student` yang merupakan subkelas dari kelas `Person`.

## Student

Kelas `Student` adalah sebuah kelas Java yang mewarisi (inherit) sifat dan perilaku dari kelas `Person`. Kelas ini memiliki konstruktor, method override, dan method main yang digunakan untuk mengilustrasikan konsep pewarisan.

### Konstruktor

Kelas `Student` memiliki sebuah konstruktor yang akan dipanggil saat objek dari kelas `Student` dibuat. Konstruktor ini menggunakan kata kunci `super` untuk memanggil konstruktor dari kelas induk (`Person`) dengan argumen yang telah ditentukan. Setelah itu, pesan "Inside student:Constructor" akan dicetak ke layar.

### Method Override

Kelas `Student` mengimplementasikan method override `getName()` yang telah didefinisikan di kelas `Person`. Method ini mencetak pesan "Student:getname" ke layar dan mengembalikan nilai `name` dari kelas `Person`.

### Main Method

Method `main` di kelas `Student` digunakan untuk menjalankan program. Di dalam method ini, sebuah objek `anna` dari kelas `Student` dibuat. Kemudian, nilai dari `name` dan `address` dari objek tersebut dicetak ke layar.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# StudentComputer Class

Repositori ini berisi contoh penggunaan pewarisan (inheritance) dalam pemrograman Java menggunakan kelas `StudentComputer` yang merupakan subkelas dari kelas `StudentRecord`.

## StudentComputer

Kelas `StudentComputer` adalah sebuah kelas Java yang mewarisi (inherit) sifat dan perilaku dari kelas `StudentRecord`. Kelas ini memiliki beberapa variabel dan method yang digunakan untuk mengelola informasi tambahan tentang pengetahuan komputer siswa.

### Variabel

- `network`: Variabel untuk menyimpan nilai kompetensi jaringan siswa.
- `pbo`: Variabel untuk menyimpan nilai kompetensi pemrograman berorientasi objek (PBO) siswa.
- `web`: Variabel untuk menyimpan nilai kompetensi pengembangan web siswa.
- `average`: Variabel untuk menyimpan nilai rata-rata dari ketiga kompetensi.

### Method

- `getNetwork()`: Method untuk mendapatkan nilai kompetensi jaringan siswa.
- `setNetwork()`: Method untuk mengatur nilai kompetensi jaringan siswa.
- `getPbo()`: Method untuk mendapatkan nilai kompetensi PBO siswa.
- `setPbo()`: Method untuk mengatur nilai kompetensi PBO siswa.
- `getWeb()`: Method untuk mendapatkan nilai kompetensi pengembangan web siswa.
- `setWeb()`: Method untuk mengatur nilai kompetensi pengembangan web siswa.
- `getAverage()`: Method untuk mendapatkan nilai rata-rata dari ketiga kompetensi.
- `setAverage()`: Method untuk mengatur nilai rata-rata dari ketiga kompetensi.
- `getName()`: Method override untuk mendapatkan nama siswa dan mencetaknya ke layar.

### Main Method

Method `main` di kelas `StudentComputer` digunakan untuk menjalankan program. Di dalam method ini, sebuah objek `siswa1` dari kelas `StudentComputer` dibuat. Kemudian, nilai-nilai kompetensi dan informasi siswa diatur menggunakan setter method. Sebuah referensi `ref` dari tipe `StudentRecord` diinisialisasi dengan objek `siswa1`. Kemudian, data siswa dan nilai kompetensi dicetak ke layar menggunakan getter method.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# StudentRecord Class

Repositori ini berisi contoh implementasi kelas `StudentRecord` dalam pemrograman Java.

## StudentRecord

Kelas `StudentRecord` adalah kelas Java yang menyediakan fungsi-fungsi untuk mengelola data siswa. Kelas ini memiliki beberapa variabel dan method yang digunakan untuk mengatur informasi seperti nama, alamat, dan usia siswa.

### Variabel

- `name`: Variabel untuk menyimpan nama siswa.
- `address`: Variabel untuk menyimpan alamat siswa.
- `age`: Variabel untuk menyimpan usia siswa.

### Constructor

- `StudentRecord()`: Constructor tanpa parameter yang mencetak pesan "SuperClass" ke layar.
- `StudentRecord(String name, String address, String age)`: Constructor dengan tiga parameter untuk menginisialisasi nama, alamat, dan usia siswa.
- `StudentRecord(String name)`: Constructor dengan satu parameter untuk menginisialisasi nama siswa. Alamat dan usia siswa akan diatur sebagai string kosong.

### Method

- `getName()`: Method untuk mendapatkan nama siswa dan mencetaknya ke layar.
- `getAddress()`: Method untuk mendapatkan alamat siswa.
- `getAge()`: Method untuk mendapatkan usia siswa.
- `setName()`: Method untuk mengatur nama siswa.
- `setAddress()`: Method untuk mengatur alamat siswa.
- `setAge()`: Method untuk mengatur usia siswa.

### Cara Menggunakan

Anda dapat menggunakan kelas `StudentRecord` dengan cara berikut:

1. Membuat objek `StudentRecord` menggunakan salah satu constructor yang sesuai.
2. Menggunakan setter method untuk mengatur nilai nama, alamat, dan usia siswa.
3. Menggunakan getter method untuk mendapatkan nilai nama, alamat, dan usia siswa.

Contoh penggunaan:

```java
StudentRecord student = new StudentRecord("John Doe", "123 Main Street", "18");
student.setName("Jane Doe");
System.out.println("Nama: " + student.getName());
System.out.println("Alamat: " + student.getAddress());
System.out.println("Usia: " + student.getAge());


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Shapes

Repositori ini berisi kelas-kelas Java yang mewakili berbagai bentuk dan menghitung luasnya.

## Shape

Kelas `Shape` adalah kelas abstrak yang menjadi kelas dasar untuk semua bentuk. Kelas ini mendefinisikan dua method abstrak:

- `getArea()`: Menghitung dan mengembalikan luas dari bentuk.
- `getName()`: Mengembalikan nama dari bentuk.

## Circle

Kelas `Circle` adalah subkelas dari `Shape` yang mewakili sebuah lingkaran. Kelas ini memiliki field privat `radius` dan memberikan implementasi untuk method abstrak yang didefinisikan dalam kelas `Shape`.

### Konstruktor

- `Circle(double radius)`: Membuat objek `Circle` baru dengan jari-jari yang ditentukan.

### Method

- `getArea()`: Menghitung dan mengembalikan luas dari lingkaran menggunakan rumus `π * radius^2`, dimana `π` memiliki nilai sekitar 3,14.
- `getName()`: Mengembalikan nama dari bentuk, yaitu "Lingkaran".

## Square

Kelas `Square` adalah subkelas dari `Shape` yang mewakili sebuah persegi. Kelas ini memiliki field privat `side` dan memberikan implementasi untuk method abstrak yang didefinisikan dalam kelas `Shape`.

### Konstruktor

- `Square(double side)`: Membuat objek `Square` baru dengan panjang sisi yang ditentukan.

### Method

- `getArea()`: Menghitung dan mengembalikan luas dari persegi menggunakan rumus `side^2`.
- `getName()`: Mengembalikan nama dari bentuk, yaitu "Persegi".

