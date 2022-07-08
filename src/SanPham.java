import java.io.Serializable;
import java.util.ArrayList;

public class SanPham implements Serializable {
    private String id;
    private String ten;
    private double gia;
    private String color;
    private int soLuong;
    private String moTa;
    private Hang hang;


    public SanPham() {
    }

    public SanPham(String ten, int soLuong) {
        this.ten = ten;
        this.soLuong = soLuong;
    }

    public SanPham(String id, String ten, double gia, String color, int soLuong, String moTa, Hang hang) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.color = color;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.hang = hang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }

    @Override
    public String toString() {
        return "Thông tin sản phẩm {" +
                "Mã sản phẩm :'" + id + '\'' +
                ", Tên sản phẩm :'" + ten + '\'' +
                ", Giá =" + gia +
                ", Màu sắc :'" + color + '\'' +
                ", Số lượng =" + soLuong +
                ", Mô tả :'" + moTa + '\'' +
                ", Hãng  :" + hang +
                '}';
    }
}
