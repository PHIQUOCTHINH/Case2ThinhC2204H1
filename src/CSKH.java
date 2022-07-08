import java.io.Serializable;
import java.time.LocalDate;

public class CSKH implements Serializable {
    private String thongBao;
    private LocalDate localDate;
    private String hoVaTen;
    private String diaChiEmail;
    private String sdt;

    public CSKH(String thongBao, LocalDate localDate, String hoVaTen, String diaChiEmail, String sdt) {
        this.thongBao = thongBao;
        this.localDate = localDate;
        this.hoVaTen = hoVaTen;
        this.diaChiEmail = diaChiEmail;
        this.sdt = sdt;
    }

    public String getThongBao() {
        return thongBao;
    }

    public void setThongBao(String thongBao) {
        this.thongBao = thongBao;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChiEmail() {
        return diaChiEmail;
    }

    public void setDiaChiEmail(String diaChiEmail) {
        this.diaChiEmail = diaChiEmail;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "CSKH{" +
                "Nội dung =:'" + thongBao + '\'' +
                ", Thời gian " + localDate +
                ", Họ và tên khách :'" + hoVaTen + '\'' +
                ", Địa chỉ emial :'" + diaChiEmail + '\'' +
                ", Số điện thoại :'" + sdt + '\'' +
                '}';
    }
}
