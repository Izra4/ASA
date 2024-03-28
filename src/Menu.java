public class Menu {
    private String nama;
    private int harga;
    private String tipe;
    public Menu(String nama, int harga, String tipe){
        this.nama = nama;
        this.harga = harga;
        this.tipe = tipe;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }
}
