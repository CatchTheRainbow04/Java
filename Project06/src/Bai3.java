import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public Bai3(){
        Scanner sc = new Scanner(System.in);
        Bai1 b1 = new Bai1();
        ArrayList<SinhVienNTU> list = b1.nhapDuLieu();
        Bai2 b2 = new Bai2();
        b2.xuatDuLieu(list);
        System.out.println("Nhap vao diem min:");
        double min = sc.nextDouble();
        System.out.println("Nhap vao diem max:");
        double max = sc.nextDouble();
        System.out.println("Danh sach sinh vien co diem trong khoang [" + min + ", " + max + "]:");
        for (SinhVienNTU sinhVienNTU : list) {
            if (sinhVienNTU.getScore() >= min && sinhVienNTU.getScore() <= max) {
                sinhVienNTU.XuatDuLieu();
            }
        }
    }
}
