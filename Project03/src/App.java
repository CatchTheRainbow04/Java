import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        double tongKhoangcach = 0;
        Diem diemMin = null;
        double khoangCachMin = Double.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so diem :");
        n = sc.nextInt();
        // khai bao mang de luu tru cac diem
        Diem[] d = new Diem[n];
        // Nhap toa do cho tung diem
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao gia tri diem thu " + (i + 1));
            d[i] = new Diem();
            d[i].NhapToaDo();
            double khoangcach = d[i].KhoangCachToiGoc();
            tongKhoangcach += khoangcach;
            if (khoangcach < khoangCachMin) {
                khoangCachMin = khoangcach;
                diemMin = d[i];
            }
        }
        // khoang cach tu diem nay toi diem khac
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println("khoang cach tu diem thu " + (i + 1) + " toi diem thu " + (j + 1) + ": "
                        + d[i].KhoangCachGiuaHaiDiem(d[i], d[j]));
            }
        }
        // In ra tong khoang cach tu cac diem den goc toa do
        System.out.printf("Tong khoang cach tu cac diem den goc toa do: %.2f \n", tongKhoangcach);
        // In ra thong tin cua diem gan goc toa do nhat
        System.out.println("Toa do cua diem gan goc toa do nhat la: ");
        diemMin.XuatDuLieu();
        sc.close();
    }
}
