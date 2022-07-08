import java.io.Serializable;
import java.util.ArrayList;

public class Hang implements Serializable {
    private String tenHang;
    private int id;
    private XuatXu xuatXu;

    public Hang(int id) {
        this.id = id;
    }

    public XuatXu getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }

    public Hang() {
    }

    public Hang(XuatXu xuatXu) {
        this.xuatXu = xuatXu;
    }

    public Hang(String tenHang, int id, XuatXu xuatXu) {
        this.tenHang = tenHang;
        this.id = id;
        this.xuatXu = xuatXu;
    }


    public Hang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Hang(String tenHang, int id) {
        this.tenHang = tenHang;
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hãng sản xuất {" +
                "Tên Hãng :'" + tenHang + '\'' +
                ", id :" + id +
                ", Nới sản xuất :" + xuatXu +
                '}';
    }
}
