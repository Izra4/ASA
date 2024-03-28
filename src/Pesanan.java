public class Pesanan {
    private Menu menu;
    private int kuantitas;

    public Pesanan(Menu menu, int kuantitas) {
        this.menu = menu;
        this.kuantitas = kuantitas;
    }

    public String getNamaMenu() {
        return menu.getNama();
    }

    public void tambahKuantitas(int kuantitas) {
        this.kuantitas += kuantitas;
    }

    public int getHargaMenu() {
        return menu.getHarga();
    }

    public int getKuantitas() {
        return kuantitas;
    }
}
