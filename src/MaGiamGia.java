import java.io.Serializable;
import java.time.LocalDate;

public class MaGiamGia implements Serializable {
    private   String  maGiamGia = "ABCD";
    private LocalDate hsd;
    private LocalDate nph = LocalDate.now();

    public MaGiamGia(LocalDate hsx, LocalDate nph) {
        this.hsd = hsx;
        this.nph = nph;
    }

    public MaGiamGia(String maGiamGia, LocalDate hsd, LocalDate nph) {
        this.maGiamGia = maGiamGia;
        this.hsd = hsd;
        this.nph = nph;
    }

    public MaGiamGia() {
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public LocalDate getHsx() {
        return hsd;
    }

    public void setHsx(LocalDate hsx) {
        this.hsd = hsx;
    }

    public LocalDate getNph() {
        return nph;
    }

    public void setNph(LocalDate nph) {
        this.nph = nph;
    }

    @Override
    public String toString() {
        return "Mã giảm giá {" +
                " Mã nhập :'" + maGiamGia + '\'' +
                ", Ngày phát hành :" + nph +
                ", Hạn sử dụng :" + hsd +

                '}';
    }
}
