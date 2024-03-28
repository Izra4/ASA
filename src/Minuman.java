public class Minuman extends Menu{
    public Minuman(String nama, int harga, String tipe) {
        super(nama, harga, tipe);
        if (this.getTipe().equalsIgnoreCase("venti")){
            this.setHarga(this.getHarga()+15000);
        }else if (this.getTipe().equalsIgnoreCase("tall")){
            this.setHarga(this.getHarga()+5000);
        } else if (this.getTipe().equalsIgnoreCase("grande")){
            this.setHarga(this.getHarga()+10000);
        }else {
            this.setHarga(this.getHarga());
        }
    }
}
