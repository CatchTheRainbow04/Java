import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong nhan vien :");
        int n = sc.nextInt();
        NhanVien[] ds = new NhanVien[n];
        for ( int i = 0 ; i  < n ; i ++){
            System.out.println("Nhap thong tin cua nhan vien thu " + (i+1));
            ds[i] = new NhanVien();
            ds[i].NhapDuLieu();
        }
        for ( int i = 0 ; i  < n ; i ++){
            ds[i].XuatDuLieu();
        }
        sc.close();
    }
}
