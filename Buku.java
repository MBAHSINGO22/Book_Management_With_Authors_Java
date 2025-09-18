package Modul_6;

import java.util.ArrayList;
import java.util.List;

// Kelas Buku digunakan untuk merepresentasikan data buku dalam sistem.
public class Buku {
    // Atribut kodeBuku digunakan untuk menyimpan kode buku.
    String kodeBuku;
    // Atribut judul digunakan untuk menyimpan judul buku.
    String judul;
    // Atribut pengarang digunakan untuk menyimpan daftar pengarang buku.
    List<Pengarang> pengarang;
    // Atribut tahunTerbit digunakan untuk menyimpan tahun terbit buku.
    int tahunTerbit;
    // Atribut daftarBuku digunakan untuk menyimpan daftar semua buku yang ada dalam
    // sistem.
    static List<Buku> daftarBuku = new ArrayList<>();

    // Konstruktor Buku digunakan untuk membuat objek Buku baru dengan kode buku,
    // judul, dan tahun terbit yang diberikan.
    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        // Membuat daftar pengarang baru untuk buku ini.
        this.pengarang = new ArrayList<>();
        // Menambahkan buku ini ke dalam daftar buku sistem.
        daftarBuku.add(this);
    }

    // Metode tambahPengarang digunakan untuk menambahkan pengarang ke dalam
    // daftar pengarang buku.
    public void tambahPengarang(Pengarang pengarang) {
        this.pengarang.add(pengarang);
    }

    // Metode jumlahBukuTahunTertentu digunakan untuk menghitung jumlah buku
    // yang diterbitkan pada tahun tertentu.
    public static int jumlahBukuTahunTertentu(int tahun) {
        int jumlah = 0;
        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit == tahun) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Metode bukuTerbitanLama digunakan untuk mencari buku dengan tahun terbit
    // terlama dalam daftar buku.
    public static Buku bukuTerbitanLama() {
        Buku bukuTerlama = null;
        for (Buku buku : daftarBuku) {
            if (bukuTerlama == null || buku.tahunTerbit < bukuTerlama.tahunTerbit) {
                bukuTerlama = buku;
            }
        }
        return bukuTerlama;
    }

    // Metode bukuTerbitanTerbaru digunakan untuk mencari buku dengan tahun terbit
    // terbaru dalam daftar buku.
    public static Buku bukuTerbitanTerbaru() {
        Buku bukuTerbaru = null;
        for (Buku buku : daftarBuku) {
            if (bukuTerbaru == null || buku.tahunTerbit > bukuTerbaru.tahunTerbit) {
                bukuTerbaru = buku;
            }
        }
        return bukuTerbaru;
    }

    // Metode cetakInformasiBuku digunakan untuk mencetak informasi semua buku
    // yang ada dalam daftar buku sistem.
    public static void cetakInformasiBuku() {
        for (Buku buku : daftarBuku) {
            System.out.println("Kode Buku: " + buku.kodeBuku);
            System.out.println("Judul: " + buku.judul);
            System.out.println("Tahun Terbit: " + buku.tahunTerbit);
            System.out.println("Pengarang:");
            for (Pengarang pengarang : buku.pengarang) {
                System.out.println(" - " + pengarang.nama);
            }
            System.out.println();
        }
    }
}
