import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHang {
    ArrayList<Hang> hangs = new ArrayList<>();
    private Hang quanLyHang = new Hang();


    public QuanLyHang() {
    }

    public QuanLyHang(ArrayList<Hang> hangs, Hang quanLyHang) {
        this.hangs = hangs;
        this.quanLyHang = quanLyHang;
    }

    public QuanLyHang(ArrayList<Hang> hangs) {
        this.hangs = hangs;
    }

    public ArrayList<Hang> getHangs() {
        return hangs;
    }

    public void setHangs(ArrayList<Hang> hangs) {
        this.hangs = hangs;
    }

    public Hang getQuanLyHang() {
        return quanLyHang;
    }

    public void setQuanLyHang(Hang quanLyHang) {
        this.quanLyHang = quanLyHang;
    }

    public QuanLyHang(Hang quanLyHang) {
        this.quanLyHang = quanLyHang;
    }


    public Hang them(Hang hang) throws IOException {
        hangs.add(hang);

       return null;
    }

    private Hang taoHang(Scanner scanner) {
        System.out.println("Nhap ten hang san xuat");
        String ten = scanner.nextLine();
        Hang hang = new Hang(ten);
        return hang;
    }


    public Hang xoa(String name) throws IOException {
        Hang hang = null;
        for (Hang hang1 : hangs) {
            if (hang1.getId() == hang1.getId()) {
                hang = hang1;
            }
            if (hang != null) {
                hangs.remove(hang);

                return hang;
            }
        }
        return null;
    }



    public void sua(Hang hang) {
        for (int i = 0; i < hangs.size(); i++) {
            if (hangs.get(i).getId() == hang.getId()) {
                hangs.set(i, hang);
            }
        }
    }

    public void hienThi() throws IOException {
        for (Hang hang : hangs) {
            System.out.println(hang);
        }
    }


    public void docTapTin(String tenFile) throws IOException {

    }


    //    public void docTapTin(String tenFile) {
//        ArrayList<Hang> hangs1;
//        try {
//            FileInputStream fileInputStream = new FileInputStream("hangsanxuat.txt");
//            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
//            hangs1 = (ArrayList<Hang>) ois.readObject();
//            ois.close();
//            hangs = hangs1;
////            Hang hang;
////            while ((hang = (Hang) ois.readObject()) != null) {
////                this.hangs.add(hang);
////                System.out.println(hang + " \n");
////            }
////            ois.close();
//        } catch (Exception e) {
//            System.out.println();
//
//        }
//    }
public ArrayList<Hang> docTapTin()  {
    try {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\hangsanxuat.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        hangs = (ArrayList<Hang>) objectInputStream.readObject();
        objectInputStream.close();

    }catch (Exception e) {
        System.out.println();
    }
    return hangs;
}

    public void ghiTapTin(String tenFile) throws IOException {

    }
//


    public void ghiTapTin(ArrayList<Hang> hangs) throws IOException {
        File file = new File("C:\\Users\\okane\\IdeaProjects\\CaseStudy1\\hangsanxuat.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Hang hang : hangs) {
                oos.writeObject(hang);
            }
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
//    public void writeToFile(ArrayList<Product> products){
//        try {
//            File file = new File("product.txt");
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file,false));
//            objectOutputStream.writeObject(products);
//            objectOutputStream.close();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }