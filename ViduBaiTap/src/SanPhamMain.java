import java.util.ArrayList;

public class SanPhamMain {
    public static void main(String[] args) {
        // Khai báo danh sách sản phẩm
        ArrayList<SanPham> dsSanPham = new ArrayList<>();

        // Nhập 3 sản phẩm
        SanPham sp1 = new SanPham(0, "Kem", "Giải khát", null);
        SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
        SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);

        // Thêm vào danh sách
        dsSanPham.add(sp1);
        dsSanPham.add(sp2);
        dsSanPham.add(sp3);

        // In danh sách sản phẩm
        for (SanPham sp : dsSanPham) {
            System.out.println(sp);
        }
    }
}
