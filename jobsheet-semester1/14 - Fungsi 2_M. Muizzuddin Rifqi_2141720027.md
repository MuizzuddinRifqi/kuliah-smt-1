```Java
// Nama  : M. Muizzuddin Rifqi
// Kelas : 1E / 14
// Nim   : 2141720027
```

# JOBSHEET 14. Fungsi 2

## Tujuan
* Mahasiswa memahami konsep fungsi rekursif
* Mahasiswa mampu mengimplementasikan fungsi rekursif dalam kode program



## Alat dan Bahan
* PC/Laptop
* Browser
* Koneksi internet
* Anaconda3 + Java kernel (opsional)

## Praktikum

### Percobaan 1
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung nilai faktorial dari suatu bilangan dengan menggunakan fungsi rekursif. Selain itu, akan dibuat juga fungsi untuk menghitung nilai faktorial dengan menggunakan algoritma iteratif sebagai pembandingnya

1. Buat fungsi static dengan nama **faktorialRekursif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya

    ![Gambar 1](images/code14-1.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1
static int faktorialRekursif(int n) {
    if (n == 0) {
        return(1);
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}
```

2. Buat lagi fungsi static dengan nama **faktorialIteratif()**, dengan tipe data kembalian fungsi int dan memiliki 1 parameter dengan tipe data int berupa bilangan yang akan dihitung nilai faktorialnya.

    ![Gambar 2](images/code14-2.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 2
static int faktorialIteratif(int n) {
    int faktor = 1;
    for (int i = n; i >= 1; i--) {
        faktor = faktor * i;
    }
    return faktor;
}
```

3. Lakukan pemanggilan terhadap kedua fungsi yang telah dibuat sebelumnya, dan tampilkan hasil yang didapatkan.

    ![Gambar 3](images/code14-3.png)


```Java
// Tuliskan kode program Percobaan 1 Langkah 1, 2, 3
System.out.println(faktorialRekursif(5));
System.out.println(faktorialIteratif(5));
```

    120
    120
    

4. Jika ditelusuri, pada saat pemanggilan fungsi faktorialRekursif(5),maka proses yang terjadi dapat diilustrasikan sebagai berikut:

    ![Gambar 4](images/code14-4.png)

#### Pertanyaan
1. Apa yang dimaksud dengan fungsi rekursif?
2. Bagaimana contoh kasus penggunaan fungsi rekursif ?
3. Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif!


1). Fungsi rekursif adalah sebuah fungsi yang didalamnya terdapat perintah untuk memanggil dirinya sendiri.

2). Fungsi rekursif biasanya digunakan untuk menyelesaikan permasalahan yang memiliki pola atau keteraturan, contohnya dalam menyelesaikan soal deret bilangan, faktorial, dan pangkat.

3). Hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() adalah sama. Perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif adalah 

*fungsi rekursif menggunakan pengulangan dengan struktur if-else dan pemberhentian pengulangannya akan langsung terjadi saat base case terpenuhi. 

*fungsi iteratif, menggunakan pengulangan dengan struktur for/while dan pengulangan berhenti saat kondisi bernilai false.

### Percobaan 2
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung pangkat sebuah bilangan dengan menggunakan fungsi rekursif.

1. Buat fungsi static dengan nama **hitungPangkat()**, dengan tipe data kembalian fungsi int dan memiliki 2 parameter dengan tipe data int berupa bilangan yang akan dihitung pangkatnya dan bilangan pangkatnya

    ![Gambar 5](images/code14-5.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah dua buah variabel bertipe int dengan nama bilangan dan pangkat
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

    ![Gambar 6](images/code14-6.png)

5. Lakukan pemanggilan fungsi hitungPangkat yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 7](images/code14-7.png)


```Java
// Tuliskan kode program Percobaan 2 Langkah 1 - 5
static int hitungPangkat(int x, int y) {
    if (y == 0) {
        return(1);
    } else {
        return(x * hitungPangkat(x, y-1));
    }
}

Scanner sc = new Scanner(System.in);
int bilangan, pangkat;

System.out.print("Bilangan yang dihitung : ");
bilangan = sc.nextInt();
System.out.print("Pangkat : ");
pangkat = sc.nextInt();

System.out.println(hitungPangkat(bilangan, pangkat));
```

    Bilangan yang dihitung : 5
    Pangkat : 3
    125
    

#### Pertanyaan
1. Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan!

1). Pemanggilan fungsi tersebut akan dijalankan sampai sejumlah pangkat diinputkan dan tentunya saat base case (y == 0) terpenuhi.

### Percobaan 3
Pada percobaan ini akan dilakukan pembuatan program untuk menghitung jumlah uang nasabah yang disimpan di Bank setelah mendapatkan bunga selama beberapa tahun dengan menggunakan fungsi rekursif. 

1. Buat fungsi static dengan nama **hitungBunga()**, dengan tipe data kembalian fungsi double dan memiliki 2 parameter dengan tipe  data int berupa saldo nasabah dan lamanya menabung. Pada kasus ini dianggap bunga yang ditentukan oleh bank adalah 11% per tahun. Karena perhitungan bunga adalah bunga * saldo, sehingga untuk menghitung besarnya uang setelah ditambah bunga adalah saldo + bunga * saldo. Dalam hal ini, besarnya bunga adalah 0.11 * saldo, dan saldo dianggap 1 * saldo, sehingga 1 * saldo + 0.11 * saldo dapat diringkas menjadi 1.11 * saldo untuk perhitungan saldo setelah ditambah bunga (dalam setahun).

    ![Gambar 8](images/code14-8.png)

2.	Deklarasikan Scanner dengan nama sc
3.	Buatlah sebuah variabel bertipa double dengan nama saldoAwal dan sebuah variabel bertipe int bernama tahun
4.	Tambahkan kode berikut ini untuk menerima input dari keyboard

 ![Gambar 9](images/code14-9.png)

5. Lakukan pemanggilan fungsi hitungBunga yang telah dibuat sebelumnya dengan mengirimkan dua nilai parameter.

    ![Gambar 10](images/code14-10.png)


```Java
// Tuliskan kode program Percobaan 3 Langkah 1 - 5
static double hitungBunga(double saldo, int tahun) {
    if (tahun == 0) {
        return (saldo);
    } else {
        return (1.11 * hitungBunga(saldo, tahun - 1));
    }
}

Scanner sc = new Scanner(System.in);
double saldoAwal;
int tahun;

System.out.print("Jumlah saldo awal : ");
saldoAwal = sc.nextInt();
System.out.print("Lamanya menabung (tahun) : ");
tahun = sc.nextInt();

System.out.print("Jumlah uang setelah " + tahun + " tahun : ");
System.out.println(hitungBunga(saldoAwal, tahun));
```

    Jumlah saldo awal : 100000
    Lamanya menabung (tahun) : 3
    Jumlah uang setelah 3 tahun : 136763.10000000003
    

#### Pertanyaan
1. Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case” dan “recursion call”!

base case: if(tahun == 0)

recursion call (mempunyai keyword return) return(saldo); return(1.11* hitungBunga(saldo,tahun - 1));

## Tugas

1. Buatlah program untuk menampilkan bilangan n sampai 0 dengan menggunakan fungsi rekursif dan fungsi iteratif. (**DeretDescendingRekursif**).


```Java
// Tuliskan jawaban tugas nomor 1
static void deretDescendingRekursif(int n) {
    System.out.println(n);
    
    if (n == 0) {
        return;
    } else {
        deretDescendingRekursif(n - 1);
    }
}

static void deretDescendingIteratif(int n) {
    for (int i = n; i >= 0; i--) {
        System.out.println(i);
    }
    
}

String pisah = "=".repeat(25);

Scanner sc = new Scanner(System.in);
System.out.print("Masukkan n : ");
int n = sc.nextInt();

System.out.println(pisah);
System.out.println("Deret Descending Rekursif");
System.out.println(pisah);
deretDescendingRekursif(n);

System.out.println(pisah);
System.out.println("Deret Descending Iteratif");
System.out.println(pisah);
deretDescendingIteratif(n);
```

    Masukkan n : 8
    =========================
    Deret Descending Rekursif
    =========================
    8
    7
    6
    5
    4
    3
    2
    1
    0
    =========================
    Deret Descending Iteratif
    =========================
    8
    7
    6
    5
    4
    3
    2
    1
    0
    

2. Buatlah program yang di dalamnya terdapat fungsi rekursif untuk menghitung bilangan faktorial. Misalniya f = 8, maka akan dihasilkan 1+2+3+4+5+6+7+8 = 36 (**PenjumlahanRekursif**).


```Java
// Tuliskan jawaban tugas nomor 2
static int penjumlahanRekursif(int n) {
    if (n == 1) {
        return(n);
    } else {
        return (n + penjumlahanRekursif(n - 1));
    }
}

System.out.println(penjumlahanRekursif(8));

```

    36
    

3.	Buat program yang di dalamnya terdapat fungsi rekursif untuk mengecek apakah suatu bilangan n merupakan bilangan prima atau bukan. n dikatakan bukan bilangan prima jika ia habis dibagi dengan bilangan kurang dari n. (**CekPrimaRekursif**).


```Java
// Tuliskan jawaban tugas nomor 3
static int cekPrimaRekursif(int x, int y) {
    if (y == 1) {
        return(1);
    } else if
        (x % y == 0) {
        return(0);
    } else {
        return (0 + cekPrimaRekursif(x, y - 1));
    }
}

Scanner input = new Scanner(System.in);

for (int i=0; i<=3; i++) {
    System.out.print("Masukkan Bilangan : ");
    int bil = input.nextInt();
    if (cekPrimaRekursif(bil, bil-1)==1) {
        System.out.println("Bilangan " +bil+ " adalah bilangan Prima");
    } else {
        System.out.println("Bilangan " +bil+ " Bukan bilangan Prima");
    }
}



```

    Masukkan Bilangan : 2
    Bilangan 2 adalah bilangan Prima
    Masukkan Bilangan : 3
    Bilangan 3 adalah bilangan Prima
    Masukkan Bilangan : 4
    Bilangan 4 Bukan bilangan Prima
    Masukkan Bilangan : 5
    Bilangan 5 adalah bilangan Prima
    

4.	Sepasang marmut yang baru lahir (jantan dan betina) ditempatkan pada suatu pembiakan.  Setelah dua bulan pasangan marmut tersebut melahirkan sepasang marmut kembar (jantan dan betina). Setiap pasangan marmut yang lahir juga akan melahirkan sepasang marmut juga setiap 2 bulan.  Berapa pasangan marmut yang ada pada akhir bulan ke-12? Buatlah programnya menggunakan fungsi rekursif! (**Fibonacci**).
Berikut ini adalah ilustrasinya dalam bentuk tabel.

 ![Gambar 11](images/code14-11.PNG)


```Java
// Tuliskan jawaban tugas nomor 4

// Rekursif Bercabang
static int fibonacci(int n) {
    if (n <= 1) {
        return(n);
    } else {
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}

Scanner input = new Scanner(System.in);
System.out.print("Masukkan Bulan : ");
int bulan = input.nextInt();

System.out.println("Total Pasangan Marmut Bulan " + bulan + " : " + fibonacci(bulan) + " ekor");
```

    Masukkan Bulan : 12
    Total Pasangan Marmut Bulan 12 : 144 ekor
    
