import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham implements PhuongThucChung<SanPham> {
 ArrayList<SanPham> sanPhams = new ArrayList<>();

    public QuanLySanPham(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }
    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public QuanLySanPham() {
    }


    @Override
    public SanPham them(SanPham sanPham) throws IOException {
        sanPhams.add(sanPham);
        return null;
    }

    @Override
    public SanPham xoa(String name) throws IOException {
        for (SanPham sanPham : sanPhams) {
            if (sanPham.getTen().equals(name)){
                sanPhams.remove(sanPham);
            } else {
                System.out.println("Nhap sai");
            }
        }
        return null;
    }

    @Override
    public void sua(SanPham sanPham) {
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getTen().equals(sanPham.getTen())){
                sanPhams.set(i,sanPham);
            }
        }
    }

    @Override
    public void hienThi() throws IOException {
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
        }
    }

    @Override
    public void docTapTin(String tenFile) throws IOException {

    }

    @Override
    public void ghiTapTin(String tenFile) throws IOException {

    }
}

