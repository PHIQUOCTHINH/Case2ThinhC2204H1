import java.io.Serializable;
import java.util.ArrayList;

public class GioHang implements Serializable {
     ArrayList<SanPham> sanPhams = new ArrayList<>();
    private ArrayList<HoaDon> hoaDons = new ArrayList<>();

    public GioHang() {
    }

    public GioHang(ArrayList<SanPham> sanPhams, ArrayList<HoaDon> hoaDons) {
        this.sanPhams = sanPhams;
        this.hoaDons = hoaDons;
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public ArrayList<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(ArrayList<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

}
