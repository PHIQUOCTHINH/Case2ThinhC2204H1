import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class QuanLyNguoiDung {
    ArrayList<NguoiDung> dsNguoiDungs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themNguoiDung() throws IOException {
        NguoiDung nguoiDung1 = taoTaiKhoan(scanner);
        dsNguoiDungs.add(nguoiDung1);
        System.out.println("Chúc mừng bạn đã đăng ký thành công ");
        ghiTapTin(dsNguoiDungs);

    }

    //TẠO TÀI KHOẢN
    public NguoiDung taoTaiKhoan(Scanner scanner) {
        System.out.println("HÃY NHẬP THÔNG TIN THEO FORM MẪU DƯỚI ĐÂY");
        System.out.println("Nhập email dăng ký tài khoản             ");
        System.out.println("Mẫu : thinh@gmail.com                    ");
        String email = "";
        while (true) {
            email = scanner.nextLine();
            Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
            if (pattern.matcher(email).find()) {
                break;
            } else {
                System.out.println("Nhập sai, hãy nhập lại");
            }
        }
        String ten;
        boolean flag = false;
        do {
            System.out.println("Tài khoản đăng nhập");
             ten = scanner.nextLine();
            for (int i = 0; i < dsNguoiDungs.size(); i++) {
                if (dsNguoiDungs.get(i).getTaiKhoan().equals(ten)) {
                    flag = true;
                }
            }
            if (flag){
                System.out.println("Tài khoản đã tồn tại, hãy thử lại");
            }
        }while (flag);

        System.out.println("Mật khẩu           ");
        String mk = scanner.nextLine();
        System.out.println("Nhập số điện thoại đăng ký");
        System.out.println("Mẫu: 0977315981           ");
        String sdt;
        while (true) {
            sdt = scanner.nextLine();
            Pattern pattern = Pattern.compile("^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$");
            if (pattern.matcher(sdt).matches()) {
                break;
            } else {
                System.out.println("Hãy nhập đúng số điện thoại của bạn");
            }
        }
        NguoiDung nguoiDung = new NguoiDung(email, ten, mk, sdt);

        return nguoiDung;
    }

    public void xoaTaiKhoan(Scanner scanner) throws IOException {
        try {
            System.out.println("Nhập tài khoản muốn xóa");
            String taiKhoan = scanner.nextLine();
            for (int i = 0; i < dsNguoiDungs.size(); i++) {
                if (dsNguoiDungs.get(i).getTaiKhoan().equals(taiKhoan)) {
                    dsNguoiDungs.remove(dsNguoiDungs.get(i));
                    ghiTapTin(dsNguoiDungs);
                }
            }
        } catch (Exception e) {
            System.out.println("Người dùng không tồn tại");
        }
    }


    public void hienThiDsNguoiDung() throws IOException {
//        dsNguoiDungs.add(new NguoiDung("helo@gmail.com", "thinh", "123", "0975314980"));
        dsNguoiDungs = docTapTinNguoiDung();
        for (NguoiDung nguoiDung : dsNguoiDungs) {
            System.out.println(nguoiDung);
        }
    }

    public boolean kiemTraTkMk(String tk, String mk) {
        for (int i = 0; i < dsNguoiDungs.size(); i++) {
            dsNguoiDungs = docTapTinNguoiDung();
            if (dsNguoiDungs.get(i).getTaiKhoan().equals(tk) && dsNguoiDungs.get(i).getMatKhau().equals(mk)) {
                return true;
            } else {
                System.out.println("Không tồn tại tài khoản ");
            }
        }
        return false;
    }

    public ArrayList<NguoiDung> docTapTinNguoiDung() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachnguoidung.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            dsNguoiDungs = (ArrayList<NguoiDung>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        return dsNguoiDungs;
    }


    public void ghiTapTin(ArrayList<NguoiDung> nguoiDungs) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachnguoidung.txt");
        if (file.exists()){
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(nguoiDungs);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
