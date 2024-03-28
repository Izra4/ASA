//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu m1 = new Makanan("Tuna Puff",25000,"Savory");
        Menu m2 = new Makanan("Brownis",15000,"Sweet");
        Menu m3 = new Makanan("Croissant",25000,"Savory");
        Menu m4 = new Minuman("Caffe Latte",20000,"Grande");
        Menu m5 = new Minuman("Americano",18000,"Short");

        Pembeli p1 = new Pembeli("Izra");
        p1.tambahMenu(m1,3);
        p1.tambahMenu(m2,2);
        p1.tambahMenu(m3,1);
        p1.tambahMenu(m4,2);
        p1.tambahMenu(m5,1);
        System.out.println();
        p1.listMenu();
        p1.hapusMenu("Brownis");
        p1.listMenu();
        p1.topUp(200000);
        p1.checkOut();
    }
}