import taikhoan.Admin;

import java.util.Scanner;

public class QuanLyQuanLy {
    Scanner scanner = new Scanner(System.in);
    Admin admin = new Admin();

    public void thayDoiMatKhau() {
        System.out.println("Nhap vao mk moi");
        String matKhauMoi = scanner.nextLine();
        admin.setMatKhau(matKhauMoi);
        System.out.println("Mat Khau moi cua ban la :" + matKhauMoi);

    }

    public boolean kiemTraAdmin() {

        do {
            try {
                System.out.println("Nhap vao tai khoan");
                String taiKhoan = scanner.nextLine();
                System.out.println("Nhap vao mat khau");
                String matKhau = scanner.nextLine();
                if (taiKhoan.equals(admin.getTaikhoan()) && matKhau.equals(admin.getMatKhau())) {
                    System.out.println("Dang nhap thanh cong");
                    return true;
                }
            } catch (Exception e) {
                System.out.println("Nhap sai mat khau ");
                return false;

            }
        } while (kiemTraAdmin());
        return false;
    }
}