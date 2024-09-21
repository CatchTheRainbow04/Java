import java.util.ArrayList;

public class Bai2 {
    public void xuatDuLieu(ArrayList<SinhVienNTU> list) {
        System.out.println("Danh sach sinh vien:");
        for (SinhVienNTU sinhVienNTU : list) {
            sinhVienNTU.XuatDuLieu();
        }
    }
}
