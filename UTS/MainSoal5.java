public class MainSoal5 {
    public class soal5Main {

        public static void main(String[] args) {
            Penulis penulis1 = new Penulis();
            penulis1.setNama("Muhammad Iqbal Makmur Al-Muniri");
            penulis1.setAlamat("Jl. Watugilang 17c");

            Buku buku1 = new Buku();
            buku1.setISBN("2241720099");
            buku1.setJudul("Senja Di Teluk Alaska");
            buku1.setHarga(99999);
            buku1.setPenulis(penulis1);

            System.out.println("Informasi Buku:");
            System.out.println("ISBN: " + buku1.getISBN());
            System.out.println("Judul: " + buku1.getJudul());
            System.out.println("Harga: " + buku1.getHarga());

            Penulis penulisBuku1 = buku1.getPenulis();
            System.out.println("Informasi Penulis:");
            System.out.println("Nama Penulis: " + penulisBuku1.getNama());
            System.out.println("Alamat Penulis: " + penulisBuku1.getAlamat());
        }
    }
}
