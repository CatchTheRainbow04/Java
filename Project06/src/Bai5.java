import java.util.Scanner;
import java.util.ArrayList;

public class Bai5 {
    public Bai5(){
        Scanner sc = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        ArrayList<SinhVienNTU> list = bai1.nhapDuLieu();
        Bai2 bai2 = new Bai2();
        bai2.xuatDuLieu(list);
        System.out.println("nhap vao ten muon tim de sua");
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
            for(int i = 0 ; i < list.size();i++){
                if(list.get(i).getName().equals(name)){
                    System.out.println("sua ten thanh :");
                    String newName = sc.nextLine();
                    list.get(i).setName(newName);
                    System.out.println("sua diem thanh :");
                    double newScore = sc.nextDouble();
                    list.get(i).setScore(newScore);
                }
            }
        }
        System.out.println("Cap nhat lai danh sach");
        for (SinhVienNTU sinhVienNTU : list) {
            sinhVienNTU.XuatDuLieu();
        }
    }
}
