import java.util.Scanner;
import java.util.ArrayList;

public class Bai1 {
    public ArrayList<SinhVienNTU> nhapDuLieu(){
        ArrayList<SinhVienNTU> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong sinh vien");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVienNTU sv = new SinhVienNTU();
            sv.NhapDuLieu();
            list.add(sv);
        }
        return list;
    }
}
