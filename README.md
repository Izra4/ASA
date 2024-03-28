## Soal UTP PBO 2023

Temanmu Kipli ingin membuka usaha coffee shop yang ia namai StarBugs. Kipli tahu bahwa kamu sedang
berkuliah di FILKOM UB. Oleh karena itu, Kipli meminta bantuanmu untuk membuatkannya aplikasi untuk
usahanya tersebut. Setelah berdiskusi dengan Kipli, kamu mendapatkan gambaran aplikasi yang ingin dibuat. Kamu pun
teringat akan pelajaran OOP dan mencoba untuk memecah requirement aplikasi tadi menjadi beberapa
objek berikut:

### Objek:

1. **Pembeli**
   - Berisi informasi nama, saldo, dan total pembelian. Setiap kali objek ini dibuat, nilai saldo awal selalu 0 dan jumlah dari total pembelian akan bertambah 1. Pembeli juga memiliki keranjang belanja yang berisi Pesanan.
   - Method:
     - `tambahMenu()`: Menambahkan Pesanan ke keranjang.
     - `hapusMenu()`: Menghapus Pesanan dari keranjang berdasarkan nama menu. Jika nama pesanan tidak ada di keranjang, program akan memberikan pesan.
     - `topUp()`: Mengisi saldo pembeli.
     - `checkout()`: Menyelesaikan pembelian. Pembelian akan berhasil dan saldo akan dipotong jika saldo mencukupi.

2. **Makanan**
   - Berisi informasi nama, harga, dan tipe. Terdapat dua tipe makanan, yakni Sweet untuk makanan manis dan Savory untuk makanan asin.

3. **Minuman**
   - Berisi informasi nama, harga, dan ukuran. Terdapat empat tipe ukuran: Short, Tall, Grande, dan Venti. Masing-masing ukuran memiliki perbedaan harga.

4. **Pesanan**
   - Berisi informasi Menu dan kuantitas menu.
   - Method:
     - `getNamaMenu()`: Mengembalikan nama menu.
     - `getHargaMenu()`: Mengembalikan harga menu.

### Good Luck Guys
