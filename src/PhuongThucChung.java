import java.io.IOException;
import java.util.Scanner;

public interface PhuongThucChung<E> {
 E them(E e) throws IOException;
 E xoa(String  name) throws IOException;
 void sua(E e);
 void hienThi() throws IOException;
 void docTapTin(String tenFile) throws IOException;
 void ghiTapTin(String tenFile) throws IOException;
    }

