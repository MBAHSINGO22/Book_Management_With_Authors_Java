# 📝 Book Management

Sistem Pengelolaan Buku dengan Java  
Proyek Java yang mengimplementasikan aplikasi untuk menambahkan buku beserta pengarang, menampilkan data, menghitung jumlah buku per tahun, dan menemukan buku terlama/terbaru.

---

## 📖 Deskripsi Proyek
Proyek pembelajaran Java yang mengimplementasikan sistem katalog buku dengan dukungan pengarang ganda. Proyek ini berfokus pada:

- 📊 **Buku.java**: Kelas untuk merepresentasikan buku dengan atribut *kode buku*, *judul*, *tahun terbit*, dan *array pengarang*, serta metode setter dan getter.  
- 🔍 **Pengarang.java**: Kelas untuk merepresentasikan pengarang dengan atribut *NIK*, *nama*, dan *alamat*.  
- 🛠️ **KelolaBuku.java**: Kelas utama untuk mengelola penambahan buku dan pengarang melalui input konsol, menampilkan data, filter jumlah buku per tahun, dan identifikasi buku terlama/terbaru.  


---

## 🧠 Teknologi
- Java  

---

## 📂 Struktur File
```
Book_Management_With_Authors_Java/
├── src/Modul_5/
├── KelolaBuku.java         # 🛠️ Kelas utama untuk pengelolaan
├── Buku.java               # 📊 Kelas untuk data buku
├── Pengarang.java          # 🔍 Kelas untuk data pengarang
```

---

## 🟢 Catatan
- Program menerima input jumlah buku, detail buku (*kode, judul, tahun terbit*), jumlah pengarang, dan detail pengarang (*NIK, nama, alamat*).  
- Filter tahun untuk jumlah buku dan identifikasi buku terlama/terbaru dihitung berdasarkan tahun terbit.  

---

## 📈 Contoh Output
```
Jumlah buku terbitan pada tahun 2005: 1
Buku terbitan paling lama: BELAJAR JAVA
Buku terbitan paling baru: BELAJAR HTML

Kode Buku: 099
Judul: BELAJAR JAVA
Tahun Terbit: 2005
Pengarang:
 - EMAN NDIWA

Kode Buku: 100
Judul: ARI SANG PENYANYI
Tahun Terbit: 2023
Pengarang:
 - COKI PARDEDE

Kode Buku: 101
Judul: BELAJAR HTML
Tahun Terbit: 2024
Pengarang:
 - FEUS
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22** 🔗 [GitHub](https://github.com/MBAHSINGO22)
