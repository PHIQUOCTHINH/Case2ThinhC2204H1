import taikhoan.Admin;

import java.io.IOException;
import java.util.Scanner;

public class DangNhap {
    public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    Admin admin =new Admin();
    MenuQuanLy menuAdmin = new MenuQuanLy();
    MenuGioHang menuGioHang = new MenuGioHang();
    QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();
    quanLyNguoiDung.docTapTinNguoiDung();
        System.out.println("Màn hình đăng nhập");
       try {
           int chon;
           do {
               System.out.println("--------------------------------------------------------------------------------------1. Chỉ có Admin");
               System.out.println("--------------------------------------------------------------------------------------2. Đăng nhập");
               System.out.println("--------------------------------------------------------------------------------------3. Đăng ky");
               System.out.println("--------------------------------------------------------------------------------------0. Thoát ");
               chon = scanner.nextInt();
               switch (chon) {
                   case 1:
                       System.out.println("Nhập tên tài khoản");
                       scanner.nextLine();
                       String tk = scanner.nextLine();
                       System.out.println("Nhập mật khẩu");
                       String mk = scanner.nextLine();
                       if (tk.equals(admin.getTaikhoan()) && mk.equals(admin.getMatKhau())){
                           menuAdmin.chayAdmin();
                           break;
                       } else {
                           System.out.println("Nhập sai tài khoản hoặc mật khẩu, hãy nhập lại");
                       }
                       break;
                   case 2:
                       System.out.println("Nhập tài khoản");
                       scanner.nextLine();
                       String tk1 = scanner.nextLine();
                       System.out.println("Nhập mật khẩu");
                       String mk1 = scanner.nextLine();
                       if (quanLyNguoiDung.kiemTraTkMk(tk1,mk1)){
                           menuGioHang.menuGioHang();
                       }
                       break;
                   case 3:
                       quanLyNguoiDung.themNguoiDung();
                       break;
               }
           } while (chon != 0);
       } catch (Exception e) {
           System.out.println();
       }
    }

}
