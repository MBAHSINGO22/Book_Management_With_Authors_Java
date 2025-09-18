package Modul_6;

// Kelas Pengarang digunakan untuk merepresentasikan data pengarang dalam sistem.
public class Pengarang {
    // Atribut NIK digunakan untuk menyimpan Nomor Induk Kependudukan pengarang.
    String NIK;
    // Atribut nama digunakan untuk menyimpan nama pengarang.
    String nama;
    // Atribut alamat digunakan untuk menyimpan alamat pengarang.
    String alamat;

    // Konstruktor Pengarang digunakan untuk membuat objek Pengarang baru dengan
    // NIK, nama, dan alamat yang diberikan.
    public Pengarang(String NIK, String nama, String alamat) {
        // Menginisialisasi atribut NIK dengan nilai yang diberikan.
        this.NIK = NIK;
        // Menginisialisasi atribut nama dengan nilai yang diberikan.
        this.nama = nama;
        // Menginisialisasi atribut alamat dengan nilai yang diberikan.
        this.alamat = alamat;
    }
}

