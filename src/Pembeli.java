public class Pembeli {
    private String nama;
    private int saldo;
    private static int jumlahPembeli;
    private Pesanan[] cart;
    private int jumlahPesanan;

    public Pembeli(String nama){
        this.nama = nama;
        this.saldo = 0;
        this.cart = new Pesanan[15];
        jumlahPembeli++;
        jumlahPesanan = 0;
    }

    public void tambahMenu(Menu menu, int jumlah){
        boolean menuDitemukan = false;
        for (int i = 0; i < jumlahPesanan; i++) {
            if (cart[i].getNamaMenu().equals(menu.getNama())) {
                cart[i].tambahKuantitas(jumlah);
                System.out.println(jumlah + " " + menu.getNama() + " berhasil ditambahkan!");
                menuDitemukan = true;
                break;
            }
        }

        if (!menuDitemukan) {
            if (jumlahPesanan == cart.length) {
                System.out.println("Keranjangmu penuh");
            } else {
                cart[jumlahPesanan] = new Pesanan(menu, jumlah);
                System.out.println(jumlah + " " + menu.getNama() + " berhasil ditambahkan!");
                jumlahPesanan++;
            }
        }
    }

    public void hapusMenu(String namaMenu){
        System.out.println("================================");
        for (int i=0; i<jumlahPesanan; i++){
            if (cart[i].getNamaMenu().equalsIgnoreCase(namaMenu)){
                for(int j=i; j<jumlahPesanan; j++){
                    cart[j] = cart[j+1];
                }
                jumlahPesanan--;
                System.out.println("Menu "+namaMenu+" berhasil dihapus!");
                System.out.println("================================");
                return;
            }
        }
        System.out.println("Menu "+namaMenu+" tidak ada di list");
        System.out.println("================================");
    }

    public void listMenu(){
        int jumlah = 1;
        System.out.println("===== List Pesanan Pak "+getNama()+" =====");
        for(int i=0; i<jumlahPesanan; i++){
            System.out.println(jumlah+". "+cart[i].getNamaMenu()+"\t: "+cart[i].getKuantitas());
            jumlah++;
        }
    }

    public void checkOut(){
        int totalHarga=0;
        System.out.println("=================================");
        System.out.println("\t\tCheckout Pesanan");
        System.out.println("=================================");
        for(int i=0; i<jumlahPesanan; i++){
            System.out.println(cart[i].getNamaMenu()+"\t\t\t\t"+cart[i].getKuantitas()+"x "+cart[i].getHargaMenu());
            totalHarga += cart[i].getKuantitas() * cart[i].getHargaMenu();
        }
        System.out.println("=================================");
        System.out.println("Jumlah yang dibayar: "+totalHarga);
        System.out.println("Saldo anda         : "+getSaldo());
        System.out.println("=================================");
        if(getSaldo() < totalHarga){
            System.out.println("Saldo anda tidak cukup");
        }else {
            System.out.println("Saldo anda tersisa: "+(getSaldo()-totalHarga));
            setSaldo(getSaldo()-totalHarga);
        }
    }

    public String getNama(){
        return this.nama;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void topUp(int saldo){
        this.saldo += saldo;
    }
    public int getSaldo() {
        return saldo;
    }

    public static int getJumlahPembeli() {
        return jumlahPembeli;
    }
}
