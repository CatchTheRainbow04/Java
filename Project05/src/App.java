import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Nhập List n sản phẩm
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong san pham:");
        int n = sc.nextInt();
        SanPham[] sp = new SanPham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao thong tin san pham thu " + (i + 1));
            ;
            sp[i] = new SanPham();
            sp[i].NhapThongTin();
        }
        // In danh sách n sản phẩm
        System.out.println("Danh sach san pham :");
        for (SanPham sanPham : sp) {
            sanPham.XuatThongTin();
        }
        // Tìm ra các sản phẩm có thành tiền nằm trong khoảng (min – max)
        System.out.println("\nNhap vao thanh tien toi thieu :");
        double min = sc.nextDouble();
        double max;
        do {
            System.out.println("Nhap vao thanh tien toi da:");
            max = sc.nextDouble();
            if (max < min) {
                System.out.println("Gia tri toi da khong hop le:");
            }
        } while (max < min);
        System.out.print("\nDanh sach san pham co thanh tien tu " + min + " toi " + max);
        for (int i = 0; i < n; i++) {
            if (sp[i].getThanhTien() >= min && sp[i].getThanhTien() <= max) {
                sp[i].XuatThongTin();
            }
        }
        // Sắp xếp danh sách theo chiều tăng dần của thành tiền 🡪 In ra màn hình
        SanPham trunggian = new SanPham();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sp[i].getThanhTien() > sp[j].getThanhTien()) {
                    trunggian = sp[i];
                    sp[i] = sp[j];
                    sp[j] = trunggian;
                }
            }
        }
        System.out.print("\nDanh sach san pham sau khi sap xep theo chieu tang dan cua thanh tien :");
        for (SanPham sanPham : sp) {
            sanPham.XuatThongTin();
        }
    }
}
