import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyMaGiamGia {
    private ArrayList<MaGiamGia> maGiamGias = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void taoMaGiamGia() throws IOException {
        System.out.println("Nhập mã giảm giá");
        String ma = scanner.nextLine();
        LocalDate nph = LocalDate.now();
        LocalDate hsd = nph.plusDays(10);
        MaGiamGia maGiamGia = new MaGiamGia(ma,hsd,nph);
        maGiamGias.add(maGiamGia);
        ghiTapTinMaGiamGia(maGiamGias);
    }
    public void xoaMaGiamGia(Scanner scanner) throws IOException {
        System.out.println("Nhập mã muốn xóa");
        String ma = scanner.nextLine();
        for (MaGiamGia maGiamGia : maGiamGias) {
            if (maGiamGia.getMaGiamGia().equals(ma)){
                maGiamGias.remove(maGiamGia);
                ghiTapTinMaGiamGia(maGiamGias);
            }
        }
    }
    public void hienThiMaGiamGia(){
        for (MaGiamGia maGiamGia : maGiamGias) {
            System.out.println(maGiamGia);
        }
    }
    public ArrayList<MaGiamGia> docTapTinMaGiamGia() {
        try {
            File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachmagiamgia.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            maGiamGias = (ArrayList<MaGiamGia>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            System.out.println();
        }
        return maGiamGias;
    }


    public void ghiTapTinMaGiamGia(ArrayList<MaGiamGia> maGiamGias) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\danhsachmagiamgia.txt");
        if (file.exists()){
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(maGiamGias);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
