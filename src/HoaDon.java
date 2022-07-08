import java.time.LocalTime;

public class HoaDon {
    private GioHang gioHang;
    private NguoiDung nguoiDung;
    private double soTienThanhToan;
    private String thoiGian;
    public HoaDon() {

    }



    public HoaDon(GioHang gioHang, NguoiDung nguoiDung, double soTienThanhToan) {
        this.gioHang = gioHang;
        this.nguoiDung = nguoiDung;
        this.soTienThanhToan = soTienThanhToan;
    }

    public HoaDon(NguoiDung nguoiDung, double soTienThanhToan) {
        this.nguoiDung = nguoiDung;
        this.soTienThanhToan = soTienThanhToan;
    }

    public HoaDon(GioHang gioHang, double soTienThanhToan) {
        this.gioHang = gioHang;
        this.soTienThanhToan = soTienThanhToan;
    }




    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public HoaDon(GioHang gioHang, NguoiDung nguoiDung, double soTienThanhToan, String thoiGian) {
        this.gioHang = gioHang;
        this.nguoiDung = nguoiDung;
        this.soTienThanhToan = soTienThanhToan;
        this.thoiGian = thoiGian;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public double getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "gioHang=" + gioHang +
                ", nguoiDung=" + nguoiDung +
                ", soTienThanhToan=" + soTienThanhToan +
                ", thoiGian='" + thoiGian + '\'' +
                '}';
    }
}
