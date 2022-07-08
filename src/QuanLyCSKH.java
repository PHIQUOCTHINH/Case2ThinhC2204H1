import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCSKH {
    ArrayList<CSKH> cskhs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void gopY() throws IOException {
        System.out.println("Nhập họ và tên");
        String ten = scanner.nextLine();
        System.out.println("Nhập địa chi email");
        String email = scanner.nextLine();
        System.out.println("Nhap sdt liên lạc");
        String sdt = scanner.nextLine();
        System.out.println("Bạn muốn nói gì?");
        String nd = scanner.nextLine();
        LocalDate localDate = LocalDate.now();
        CSKH cskh = new CSKH(nd,localDate,ten,email,sdt);
        cskhs.add(cskh);
        ghiTapTin(cskhs);
    }
    public void emailTuKhach(){
        for (CSKH cskh : cskhs) {
            System.out.println(cskh);
        }
    }
    public ArrayList<CSKH> docTapTinKhachHang() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\CSKH.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            cskhs = (ArrayList<CSKH>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        return cskhs;
    }


    public void ghiTapTin(ArrayList<CSKH> cskhs) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\CSKH.txt");
        if (file.exists()){
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(cskhs);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println();
            ;
        }
    }
}
