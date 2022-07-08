import java.io.IOException;
import java.util.Scanner;

public class MenuGioHang {

    public void menuGioHang() throws IOException {
        Scanner scanner = new Scanner(System.in);
        QuanLyGioHang quanLyGioHang = new QuanLyGioHang();
        QuanLyChung quanLyChung = new QuanLyChung();
        QuanLyCSKH quanLyCSKH = new QuanLyCSKH();
        quanLyChung.docTapTin();
        quanLyChung.docTapTinSanPham();
        quanLyGioHang.docTapTinGioHang();
        int chon;
        do {
            System.out.println("-------------MENUUUU---------------------");
            System.out.println("1.| Hiển thi danh sách sản phẩm          ");
            System.out.println("2.| Thêm sản phẩm vào giỏ hàng           ");
            System.out.println("3.| Tìm kiếm sản phẩm theo màu sắc       ");
            System.out.println("4.| Tìm kiếm sản phẩm theo hãng sản xuất ");
            System.out.println("5.| Tìm kiếm theo giá                    ");
            System.out.println("6.| Hiển thị giỏ hàng                    ");
            System.out.println("7.| Xóa sản phẩm khỏi giỏ hàng           ");
            System.out.println("8.| Thanh toán                           ");
            System.out.println("9.| Góp ý tới cửa hàng                   ");
            System.out.println("10.| Thanh toán nếu có mã giảm giá       ");
            System.out.println("0.| Quay lại màn hình đăng nhập          ");
            System.out.println("-----------------------------------------");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    quanLyChung.hienThi();
                    break;
                case 2:
                    quanLyGioHang.themVaoGioHang(scanner);
                    break;
                case 3:
                    System.out.println("Nhập vào màu sắc muốn tìm");
                    quanLyGioHang.timKiemTheoMauSac(scanner);
                    System.out.println("---------------------");
                    System.out.println("1.| Thêm vào giỏ hàng");
                    System.out.println("0.| Quay lai         ");
                    System.out.println("---------------------");
                    int chon1 = Integer.parseInt(scanner.nextLine());
                    do {
                        if (chon1 == 1) {
                            quanLyGioHang.themVaoGioHang(scanner);
                        }
                    }while (chon1 != 0);
                    break;
                case 4:
                    quanLyGioHang.timKiemTheoHang(scanner);
                    System.out.println("---------------------");
                    System.out.println("1.| Thêm vào giỏ hàng");
                    System.out.println("0.| Quay lai         ");
                    System.out.println("---------------------");
                    int chon2 = Integer.parseInt(scanner.nextLine());
                    do {
                        if (chon2 == 1) {
                            quanLyGioHang.themVaoGioHang(scanner);
                        }
                    }while (chon2 != 0);
                    break;
                case 5:
                    quanLyGioHang.timKiemTheoGia();
                    System.out.println("---------------------");
                    System.out.println("1. Thêm vào giỏ hàng");
                    System.out.println("0. Quay lại         ");
                    System.out.println("---------------------");
                    int chon3 = Integer.parseInt(scanner.nextLine());
                    do {
                        if (chon3 == 1) {
                            quanLyGioHang.themVaoGioHang(scanner);
                        }
                    }while (chon3 != 0);
                    break;
                case 6:
                    quanLyGioHang.hienThiGioHang();
                    break;
                case 7:
                    quanLyGioHang.xoaKhoiGioHang(scanner);
                    break;
                case 8:
                    quanLyGioHang.thanhToan();
                    break;
                case 9:
                    quanLyCSKH.gopY();
                    break;
                case 10:
                    quanLyGioHang.thanhToanVoiMaGiamGia();
            }

        } while ( chon != 0);

    }
}
