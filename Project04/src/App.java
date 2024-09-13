import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien:");
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao thong tin sinh vien thu " + (i + 1));
            sv[i] = new SinhVien();
            sv[i].NhapThongTin();
        }
        System.out.print("Danh sach thong tin sinh vien vua nhap:");
        for (int i = 0; i < n; i++) {
            sv[i].XuatThongTin();
        }
        System.out.println("\nNhap ki tu bat dau cua ho va ten de kiem tra:");
        boolean coSinhVien = false;
        String c = sc.next();
        for (int i = 0; i < n; i++) {
            if (sv[i].getXepLoai() == "kha" && sv[i].getHoVaTen().startsWith(c)) {
                sv[i].XuatThongTin();
                coSinhVien = true;
            }
        }
        if (!coSinhVien) {
            System.out.println("Khong co sinh vien nao ten bat dau bang " + c + " va xep loai Kha !");
        }
        SinhVien trungGian = new SinhVien();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].getDiemThi() < sv[j].getDiemThi()) {
                    trungGian = sv[i];
                    sv[i] = sv[j];
                    sv[j] = trungGian;
                }
            }
        }
        System.out.println("\nDanh sach sinh vien sau khi da sap xep theo chieu giam dan cua diem:");
        for (SinhVien sinhVien : sv) {
            sinhVien.XuatThongTin();
        }
        sc.close();
    }
}
