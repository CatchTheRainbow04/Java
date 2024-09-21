import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        Bai2 bai2 = new Bai2();
        System.out.println("1.Nhap thong tin");
        System.out.println("2.Xuat thong tin");
        System.out.println("3.Xuat danh sach theo khoang diem");
        System.out.println("4.Tim sinh vien theo ten");
        System.out.println("5.Tim va sua sinh vien theo ten");
        System.out.println("6.Tim va xoa sinh vien theo ten");
        System.out.println("Nhap vao bai tap muon xem");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                bai2.xuatDuLieu(bai1.nhapDuLieu());
                break;
            case 2:
                bai2.xuatDuLieu(bai1.nhapDuLieu());
                break;
            case 3:
                new Bai3();
                break;
            case 4:
                new Bai4();
                break;
            case 5:
                new Bai5();
                break;
            case 6:
                new Bai6();
                break;
        }
        sc.close();
    }
}
