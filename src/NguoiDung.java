import java.io.Serializable;
import java.util.ArrayList;

public class NguoiDung implements Serializable {
    private String email;
    private String taiKhoan;
    private String matKhau;
    private String sdt;
    private ArrayList<HoaDon> hoaDons = new ArrayList<>();
    private ArrayList<GioHang> gioHang;

    public NguoiDung() {
    }

    public NguoiDung(String email, String taiKhoan, String matKhau, String sdt, ArrayList<HoaDon> hoaDons, ArrayList<GioHang> gioHang) {
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.sdt = sdt;
        this.hoaDons = hoaDons;
        this.gioHang = gioHang;
    }

    public NguoiDung(String email, String sdt) {
        this.email = email;
        this.sdt = sdt;
    }

    public NguoiDung(String email, String taiKhoan, String matKhau, String sdt) {
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.sdt = sdt;
    }

    public NguoiDung(String email, String taiKhoan, String matKhau, String sdt, ArrayList<HoaDon> hoaDons) {
        this.email = email;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.sdt = sdt;
        this.hoaDons = hoaDons;
    }

    public ArrayList<GioHang> getGioHang() {
        return gioHang;
    }

    public void setGioHang(ArrayList<GioHang> gioHang) {
        this.gioHang = gioHang;
    }

    public ArrayList<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(ArrayList<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }


    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Khách hàng{" +
                " email :'" + email + '\'' +
                ", Số điện thoại :" + sdt +
                "Tên: " + taiKhoan +
                '}';
    }
}
