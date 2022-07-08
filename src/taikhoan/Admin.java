package taikhoan;

import java.util.ArrayList;

public class Admin {
    private final String taikhoan = "admin";
    private String matKhau  = "thinh";



    public Admin(String matKhau) {
        this.matKhau = matKhau;
    }

    public Admin() {
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public String toString() {
        return "taikhoan.Admin{" +
                "taikhoan='" + taikhoan + '\'' +
                ", matKhau='" + matKhau + '\'' +
                '}';
    }
}
