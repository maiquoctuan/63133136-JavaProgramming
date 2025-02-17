public class SanPham {
    private int id;
    private String ten;
    private String loai;
    private String mota;

    // Constructor
    public SanPham(int id, String ten, String loai, String mota) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", loai='" + loai + '\'' +
                ", mota='" + (mota != null ? mota : "Không có mô tả") + '\'' +
                '}';
    }
}
