import java.util.Scanner;

public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private double diemThi;
    private String xepLoai;

    public SinhVien() {
        this.maSinhVien = null;
        this.hoVaTen = null;
        this.diemThi = 0;
        this.xepLoai = null;
    }

    public SinhVien(String maSinhVien, String hoVaTen, double diemThi, String xepLoai) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemThi = diemThi;
        this.xepLoai = xepLoai;
    }

    public String XepLoai(double diemThi) {
        if (diemThi < 5) {
            return "yeu";
        }
        if (diemThi >= 5 && diemThi < 7) {
            return "trung binh";
        }
        if (diemThi >= 7 && diemThi < 8) {
            return "kha";
        }
        return "gioi";
    }

    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma sinh vien : ");
        maSinhVien = sc.nextLine();
        System.out.println("Ho ten sinh vien :");
        hoVaTen = sc.nextLine();
        System.out.println("Diem sinh vien :");
        diemThi = sc.nextDouble();
        xepLoai = XepLoai(diemThi);
    }

    public void XuatThongTin() {
        System.out.print("\nMa sinh vien : " + maSinhVien);
        System.out.print(" | Ho va ten : " + hoVaTen);
        System.out.print(" | Diem thi : " + diemThi);
        System.out.print(" | Xep loai : " + xepLoai);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public String getXepLoai() {
        return xepLoai;
    }
}
