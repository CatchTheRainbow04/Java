import java.util.Scanner;

public class SanPham {
    // Các trường dữ liệu Mã sản phẩm, tên sản phẩm, hãng sản xuất, số lượng, đơn
    // giá.
    // Các thuộc tính tương ứng với các trường dữ liệu
    private String masanpham;
    private String tensanpham;
    private String hangsanxuat;
    private int soluong;
    private double dongia;

    // Hàm tạo có tham số và hàm tạo không có tham số
    public SanPham() {
        this.masanpham = null;
        this.tensanpham = null;
        this.hangsanxuat = null;
        this.soluong = 0;
        this.dongia = 0;
    }

    public SanPham(String masanpham, String tensanpham, String hangsanxuat, int soluong, double dongia) {
        this.masanpham = masanpham;
        this.tensanpham = tensanpham;
        this.hangsanxuat = hangsanxuat;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    // Phương thức tính thành tiền = số lượng * đơn giá
    public double ThanhTien(int soluong, double dongia) {
        return soluong * dongia;
    }

    // Các phương thức: nhập, xuất
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma san pham :");
        masanpham = sc.nextLine();
        System.out.println("Ten san pham:");
        tensanpham = sc.nextLine();
        System.out.println("Hang san xuat:");
        hangsanxuat = sc.nextLine();
        System.out.println("So luong:");
        soluong = sc.nextInt();
        System.out.println("Don gia:");
        dongia = sc.nextDouble();
    }

    public void XuatThongTin() {
        System.out.print("\n | Ma san pham : " + masanpham);
        System.out.print(" | Ten san pham : " + tensanpham);
        System.out.print(" | Hang san xuat : " + hangsanxuat);
        System.out.print(" | So luong : " + soluong);
        System.out.print(" | Don gia : " + dongia);
        System.out.print(" | Thanh tien : " + ThanhTien(soluong, dongia));
    }

    public double getThanhTien() {
        return soluong * dongia;
    }
}