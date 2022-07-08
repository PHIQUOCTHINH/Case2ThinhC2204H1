import taikhoan.Admin;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyChung {
    private Admin admin = new Admin();
    private QuanLyHang quanLyHang = new QuanLyHang();
    private QuanLySanPham quanLySanPham = new QuanLySanPham();
    private ArrayList<SanPham> sanPhams = new ArrayList<>();
    private ArrayList<Hang> hangs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themSanPham() throws IOException {
        SanPham sanPham = taoSanPham(scanner);
        sanPhams.add(sanPham);
        ghiTapTinSanPham(sanPhams);
    }
    public void tuDong(){
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getSoLuong() <= 3){
                System.err.println("CHÚ Ý : Sản phẩm " + sanPhams.get(i).getId() + " sắp hết hàng" + " làm gì đi");
            }
        }
    }
    public void datThemHang() throws IOException {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getSoLuong() <= 3){
                int chon;
                do {
                    System.out.println("1.Nhập thêm hàng mới");
                    System.out.println("2.Xóa sản phẩm");
                    System.out.println("0.Thoát");
                    chon = Integer.parseInt(scanner.nextLine());
                    switch (chon){
                        case 1:
                            System.out.println("Nhập số lượng muốn thêm");
                            int sl  = Integer.parseInt(scanner.nextLine());
                            System.out.println("Nhap ten sản phẩm muốn thêm số lượng");
                            String maSp = scanner.nextLine();
                            if (sanPhams.get(i).getId().equals(maSp)) {
                                sanPhams.get(i).setSoLuong(sl + sanPhams.get(i).getSoLuong());
                                ghiTapTinSanPham(sanPhams);
                                break;
                            }
                        case 2:
                            sanPhams.remove(sanPhams.get(i));
                            ghiTapTinSanPham(sanPhams);
                    }
                } while (chon != 0);
            }
        }
    }
    public SanPham taoSanPham(Scanner scanner) {
        System.out.println("Nhập mã sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String ten = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm");
        Double gia = scanner.nextDouble();
        System.out.println("Nhập màu sắc");
        scanner.nextLine();
        String mauSac = scanner.nextLine();
        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm");
        String moTa = scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất");
        hienThiHang();
        int chon = Integer.parseInt(scanner.nextLine());
        try {
            Hang hang = this.hangs.get(chon - 1);
            SanPham sanPham = new SanPham(id, ten, gia, mauSac, soLuong, moTa, hang);
            return sanPham;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void hienThi() {
        sanPhams = docTapTinSanPham();
        for (SanPham sp : sanPhams) {
            System.out.println(sp);
        }
    }

    public void hienThiHang() {

        hangs = docTapTin();
        for (Hang hang : hangs) {
            System.out.println(hang);
        }
    }

    public void themHang() throws IOException {
        Hang hang = taoHang(scanner);
        hangs.add(hang);
        ghiTapTin(hangs);
    }

    private Hang taoHang(Scanner scanner) {
        System.out.println("Nhập vào hãng sản xuất");
        String ten = scanner.nextLine();
        System.out.println("Nhập id ");
        String id = scanner.nextLine();
        System.out.println("Nhập quốc gia");
        String xuatXu = scanner.nextLine();
        return new Hang(ten, Integer.parseInt(id), new XuatXu(xuatXu));
    }

    public void xoaThoeoId(Scanner scanner) throws IOException {
        sanPhams = docTapTinSanPham();
        System.out.println("Nhập vào mã sản phẩm muốn xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getId().equals(id)) {
                sanPhams.remove(sanPhams.get(i));
                ghiTapTinSanPham(sanPhams);
            } else {
                System.out.println("Không tồn tại mã sản phẩm muốn xóa");
            }
        }
    }


    public ArrayList<Hang> docTapTin() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\hangsanxuat.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            hangs = (ArrayList<Hang>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        return hangs;
    }


    public void ghiTapTin(ArrayList<Hang> hangs) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\hangsanxuat.txt");
        if (file.exists()){
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(hangs);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }

    public void ghiTapTinSanPham(ArrayList<SanPham> sanPhams) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachsanpham.txt");
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
    public ArrayList<SanPham> docTapTinSanPham() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachsanpham.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            sanPhams = (ArrayList<SanPham>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        return sanPhams;
    }
}