import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDon {
    ArrayList<HoaDon> hoaDons = new ArrayList<>();
    ArrayList<NguoiDung> nguoiDungs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    QuanLyNguoiDung quanLyNguoiDung = new QuanLyNguoiDung();

//    public void inHoaDon() {
//        HoaDon hoaDon = taoHoaDon(scanner);
//        hoaDons.add(hoaDon);
//        System.out.println(hoaDon);
//    }




   public void hienThiHoaDon(){
       for (HoaDon hoaDon : hoaDons) {
           System.out.println(hoaDon);
       }
   }

}