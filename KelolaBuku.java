package Modul_6;

public class KelolaBuku {
    // Metode main adalah titik awal eksekusi program.
    public static void main(String[] args) {
        // Membuat objek buku baru dengan kode buku, judul, dan tahun terbit yang diberikan.
        Buku buku1 = new Buku("099", "BELAJAR JAVA", 2005);
        Buku buku2 = new Buku("100", "ARI SANG PENYANYI", 2023);
        Buku buku3 = new Buku("101", "BELAJAR HTML", 2024);

        // Membuat objek pengarang baru dengan nomor identitas, nama, dan alamat yang diberikan.
        Pengarang pengarang1 = new Pengarang("235314099", "EMAN NDIWA", "JALAN BALI");
        Pengarang pengarang2 = new Pengarang("235314100", "COKI PARDEDE", "JALAN GODEAN");
        Pengarang pengarang3 = new Pengarang("235314098", "FEUS", "JALAN TRUCUK");

        // Menambahkan pengarang ke dalam buku menggunakan metode tambahPengarang.
        buku1.tambahPengarang(pengarang1);
        buku2.tambahPengarang(pengarang2);
        buku3.tambahPengarang(pengarang3);

        // Mencetak jumlah buku yang diterbitkan pada tahun 2005 menggunakan metode jumlahBukuTahunTertentu.
        System.out.println("Jumlah buku terbitan pada tahun 2005: " + Buku.jumlahBukuTahunTertentu(2005));

        // Mencari dan mencetak buku terbitan paling lama menggunakan metode bukuTerbitanLama.
        Buku bukuTerbitanLama = Buku.bukuTerbitanLama();
        System.out.println("Buku terbitan paling lama: " + bukuTerbitanLama.judul);

        // Mencari dan mencetak buku terbitan paling baru menggunakan metode bukuTerbitanTerbaru.
        Buku bukuTerbitanTerbaru = Buku.bukuTerbitanTerbaru();
        System.out.println("Buku terbitan paling baru: " + bukuTerbitanTerbaru.judul);

        // Mencetak informasi semua buku yang ada dalam daftar buku sistem menggunakan metode cetakInformasiBuku.
        Buku.cetakInformasiBuku();
    }
}

