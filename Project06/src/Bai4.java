import java.util.Scanner;
import java.util.ArrayList;

public class Bai4 {
    public Bai4(){
        Scanner sc = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        ArrayList<SinhVienNTU> list = bai1.nhapDuLieu();
        Bai2 bai2 = new Bai2();
        bai2.xuatDuLieu(list);
        System.out.println("nhap vao ten muon tim");
        String name = sc.nextLine();
        boolean isExist = false;
        for (SinhVienNTU sinhVienNTU : list) {
            if(sinhVienNTU.getName().equals(name)){
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("khong co sinh vien nao ten " + name);
        }else{
            System.out.println("Danh sach sinh vien co ten \""+ name + "\"");
            for (SinhVienNTU sinhVienNTU : list) {
                if(sinhVienNTU.getName().equals(name)){
                    sinhVienNTU.XuatDuLieu();
                }
            }
        }
    }
}
