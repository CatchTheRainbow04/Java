import java.util.Scanner;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private double heSoLuong;
    public void NhapDuLieu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien :");
        maNhanVien = sc.nextLine();
        System.out.println("Nhap ho va ten nhan vien :");
        hoTen = sc.nextLine();
        System.out.println("Nhap he so luong :");
        heSoLuong = sc.nextDouble();
    }
    public void XuatDuLieu (){
        System.out.print("\n" + maNhanVien + "\t");
        System.out.print(hoTen + "\t");
        System.out.print(heSoLuong + "\t");
        System.out.print(TinhLuong(heSoLuong) + "\t");
    }
    public double TinhLuong (double heSoLuong){
        return heSoLuong * 1800000 ;
    }
}
