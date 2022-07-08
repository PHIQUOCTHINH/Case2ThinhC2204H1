import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuQuanLy {
    public void chayAdmin() throws IOException {
        QuanLyChung quanLyChung = new QuanLyChung();
        QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();
        QuanLyGioHang quanLyGioHang = new QuanLyGioHang();
        QuanLyCSKH quanLyCSKH = new QuanLyCSKH();
        QuanLyMaGiamGia quanLyMaGiamGia = new QuanLyMaGiamGia();
        Scanner scanner = new Scanner(System.in);
        quanLyChung.docTapTin();
        quanLyChung.docTapTinSanPham();
        quanLyChung.tuDong();
        quanLyNguoiDung.docTapTinNguoiDung();
        quanLyGioHang.docTapTinGioHang();
        quanLyCSKH.docTapTinKhachHang();
        quanLyMaGiamGia.docTapTinMaGiamGia();
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1.Quản lý sản phẩm");
            System.out.println("2.Quan ly nguoi dung");
            System.out.println("3.Quản lý kho hàng");
            System.out.println("4.Email từ khách hàng");
            System.out.println("0.Thoat");

            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {

                case 1:
                int chon1;
                    do {
                        System.out.println("1. Thêm sản phẩm mới");
                        System.out.println("2. Hiện thị sản phẩm");
                        System.out.println("3. Thêm hãng sản xuất");
                        System.out.println("4. Hiển thị danh sách hãng sản xuất");
                        System.out.println("5. Xóa sản phẩm theo mã id");
                        System.out.println("0. Quay lại");
                        chon1 = Integer.parseInt(scanner.nextLine());

                        switch (chon1) {
                            case 1:
                                quanLyChung.themSanPham();
                                break;
                            case 2:
                                quanLyChung.hienThi();
                                break;
                            case 3:
                                quanLyChung.themHang();
                                break;
                            case 4:
                                ArrayList<Hang> hangs = quanLyChung.docTapTin();
                                for (Hang hang : hangs) {
                                    System.out.println(hang);
                                }
                                break;
                            case 5:
                                quanLyChung.xoaThoeoId(scanner);
                                break;
                        }
                    } while (chon1 != 0);
                                    break;
                case 2:
                int chon2;
                do {
                    System.out.println("Lua chon");
                    System.out.println("1.Hien thi danh sach nguoi dung");
                    System.out.println("2.Xoa tai khoan nguoi dung");
                    System.out.println("0.Thoat");
                    chon2 = Integer.parseInt(scanner.nextLine());
                    if (chon2 == 1){
                        quanLyNguoiDung.hienThiDsNguoiDung();
                    } else if (chon2 == 2){
                        quanLyNguoiDung.xoaTaiKhoan(scanner);
                    }
                }while (chon2 != 0);break;
                case 3:
                    quanLyChung.datThemHang();
                    break;
                case 4:
                    int chon3;
                    do {
                        System.out.println("1 .Email từ khách hàng ");
                        System.out.println("2 .Ưu đãi  ");
                        System.out.println("3 .Quay lại  ");
                        chon3 = Integer.parseInt(scanner.nextLine());

                        switch (chon3) {
                            case 1:
                                quanLyCSKH.emailTuKhach();
                                break;
                            case 2:
                                int chon4;
                                do {
                                    System.out.println("1 .Tạo mã khuyến mại");
                                    System.out.println("2 .Hiển thị mã ");
                                    System.out.println("3 .Xóa mã khuyến mại");
                                    System.out.println("4 .Thoát");
                                    chon4 = Integer.parseInt(scanner.nextLine());

                                    switch (chon4){
                                        case 1:
                                            quanLyMaGiamGia.taoMaGiamGia();
                                            break;
                                        case 2:
                                            quanLyMaGiamGia.hienThiMaGiamGia();
                                            break;
                                        case 3:
                                            quanLyMaGiamGia.xoaMaGiamGia(scanner);
                                            break;
                                    }
                                } while (chon4 != 0);
                                    break;
                        }
                    } while (chon3 != 0);break;


            }
        }while (chon != 0);
    }
}
