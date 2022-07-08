import taikhoan.Admin;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGioHang {

    QuanLyChung quanLyChung = new QuanLyChung();
    QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();
    ArrayList<SanPham> sanPhams = quanLyChung.docTapTinSanPham();
    ArrayList<SanPham> gioHang = new ArrayList<>();
    ArrayList<NguoiDung> nguoiDungs = new ArrayList<>();
    MaGiamGia maGiamGia = new MaGiamGia();
    QuanLyMaGiamGia quanLyMaGiamGia = new QuanLyMaGiamGia();
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Admin> thongBaoTuKhachHang = new ArrayList<>();




    public void themVaoGioHang(Scanner scanner) throws IOException {
        sanPhams = quanLyChung.docTapTinSanPham();
        String id;
        int soLuong;
        System.out.println("Nhập mã sản phẩm bạn muốn thêm vào giỏ hàng:");
        id = scanner.nextLine();
        System.out.println("Nhập số lượng bạn muốn mua");
        soLuong = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getId().equals(id) && soLuong < sanPhams.get(i).getSoLuong()) {
                    SanPham sanPham = new SanPham(sanPhams.get(i).getId(), sanPhams.get(i).getTen(), sanPhams.get(i).getGia(), sanPhams.get(i).getColor(), soLuong, sanPhams.get(i).getMoTa(), sanPhams.get(i).getHang());
                    sanPhams.get(i).setSoLuong(sanPhams.get(i).getSoLuong() - soLuong);
                    quanLyChung.ghiTapTinSanPham(sanPhams);
                    gioHang.add(sanPham);
                    ghiTapTinGioHang(sanPhams);
            } else {
                    System.out.println("Bạn không thể mua nhiều hơn :" + sanPhams.get(i).getSoLuong() + ", hãy thử với số lượng nhỏ hơn ");
                }
            }
        }



    public void timKiemTheoMauSac(Scanner scanner) {
        String mauSac = scanner.nextLine();
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getColor().equals(mauSac)) {
                System.out.println(sanPhams.get(i) + "");
            } else {
                System.out.println("Khong ton tai mat hang mau :" + mauSac);
            }
        }
    }

    public void timKiemTheoHang(Scanner scanner) {
        String hang = scanner.nextLine();
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getHang().equals(hang)) {
                System.out.println(gioHang.get(i));
            } else {
                System.out.println("Khong ton tai hang ");
            }
        }
    }

    public void timKiemTheoGia() {
        int chon6;
        for (SanPham sanPham : sanPhams) {
        do {
            System.out.println("Tim kiem");
            System.out.println("1. < 500000 ");
            System.out.println("2. 500000~1000000 ");
            System.out.println("3. > 1000000");
            System.out.println("0. Thoát");
            chon6  = Integer.parseInt(scanner.nextLine());

                switch (chon6) {
                    case 1:
                        if (sanPham.getGia() < 500000) {
                            System.out.println(sanPham);
                            break;
                        }
                    case 2:
                        if (sanPham.getGia() < 1000000 && sanPham.getGia() > 500000) {
                            System.out.println(sanPham);
                        }
                            break;
                    case 3:
                        if (sanPham.getGia() > 1000000) {
                            System.out.println(sanPham);
                        }
                        break;
                }
            }while (chon6 != 0);
        }

    }

    public void hienThiGioHang() throws IOException {
        for (SanPham gioHang : gioHang) {
            System.out.println(gioHang);
        }
    }
    public void xoaKhoiGioHang(Scanner scanner) throws IOException {
        System.out.println("Nhap vao ma san pham muon xoa");
        String id = scanner.nextLine();
        for (SanPham sanPham : gioHang) {
            if (sanPham.getId().equals(id)){
                gioHang.remove(sanPham);
                hienThiGioHang();
            } else {
                System.out.println("Ma san pham khong ton tai");
            }
        }
    }
    public void thanhToan() {
        ArrayList<MaGiamGia> maGiamGias = quanLyMaGiamGia.docTapTinMaGiamGia();
        nguoiDungs = quanLyNguoiDung.docTapTinNguoiDung();
        double tinhTien = 0;
        for (int i = 0; i < sanPhams.size(); i++) {
            for (int j = 0; j < gioHang.size(); j++) {
                    tinhTien += gioHang.get(j).getGia() * gioHang.get(j).getSoLuong();
                    System.out.println("Đã thanh toán :" + tinhTien + "vnd");
                    gioHang.clear();
             if (tinhTien >= 1000000){
                 System.out.println("Chúc mừng bạn đã nhận đc mã giảm giá");
                 System.out.println(maGiamGia.getMaGiamGia());
                 System.out.println("Hãy dùng nó cho lần sau");
                 LocalDate localDate = LocalDate.now();
                 LocalDate hsd = (localDate.plusDays(7));
                 System.out.println("Mã giảm giá có thời hạn sử dụng từ " + maGiamGia.getNph() + " đến hết ngày " + hsd);
            if (maGiamGias.get(i).getHsx().isAfter(hsd)){
                maGiamGias.remove(maGiamGias.get(i));
            }
             }
                }
            }
    }
    public void  thanhToanVoiMaGiamGia() {
            nguoiDungs = quanLyNguoiDung.docTapTinNguoiDung();
            double tinhTien = 0;
            System.out.println("Nhập mã giảm giá");
            String maGiamGia1 = scanner.nextLine();
                for (int i = 0; i < sanPhams.size(); i++) {
                    for (int j = 0; j < gioHang.size(); j++) {
                       if (maGiamGia.getMaGiamGia().equals(maGiamGia1)) {
                           tinhTien += gioHang.get(j).getGia() * gioHang.get(j).getSoLuong() * 0.9;
                           System.out.println("Đã thanh toán :" + tinhTien + "vnd");
                           gioHang.clear();
            }
        }
    }
}
    public void ghiTapTinGioHang(ArrayList<SanPham> sanPhams) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachsanphamtronggiohang.txt");
        if (file.exists()){
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(sanPhams);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public ArrayList<SanPham> docTapTinGioHang() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachsanphamtronggiohang.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            sanPhams = (ArrayList<SanPham>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        return sanPhams;
    }

}





