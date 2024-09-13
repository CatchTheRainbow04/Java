import java.util.Scanner;

public class Diem {
    private double x;
    private double y;

    // ham tao khong co tham so
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // ham nhap toa do
    public void NhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao hoanh do x :");
        x = sc.nextDouble();
        System.out.println("nhap vao tung do y:");
        y = sc.nextDouble();
    }

    // tinh khoang cach tu diem toi goc toa do
    public double KhoangCachToiGoc() {
        return Math.sqrt(x * x + y * y);
    }

    // khoang cach giua 2 diem bat ki
    public double KhoangCachGiuaHaiDiem(Diem d1, Diem d2) {
        double hieuhHoanhDo = d2.x - d1.x;
        double hieuTungDo = d2.y - d1.y;
        return Math.sqrt(Math.pow(hieuhHoanhDo, 2) + Math.pow(hieuTungDo, 2));
    }

    // Xuat du lieu
    public void XuatDuLieu() {
        System.out.println("Hoanh do :" + x + " | Tung do :" + y);
        System.out.println("Khoang cach toi goc toa do : " + KhoangCachToiGoc());
    }

    public double getHoanhDo() {
        return x;
    }

    public double getTungDo() {
        return y;
    }
}
