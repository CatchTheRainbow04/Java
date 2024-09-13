import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTenSV;
    private double diemTB;
    //
    public String xepLoai (double diemTB) {
        if (diemTB < 5) {
            return "Yeu";
        }
        if(diemTB >= 5 && diemTB < 7){
            return "Trung binh";
        }
        if(diemTB >=7 && diemTB < 8){
            return "Kha";
        }
        if(diemTB >=8 && diemTB < 9){
            return "Gioi";
        }
        return "Xuat sac";
    }
    public void nhapDuLieu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien");
        hoTenSV = sc.nextLine();
        System.out.println("Nhap diem trung binh");
        diemTB = sc.nextDouble();
        sc.close();
    }
    public void xuatDuLieu(){
        System.out.println("Ma sinh vien : " + maSV);
        System.out.println("Ho ten sinh vien : " + hoTenSV);
        System.out.println("Diem trung binh : " + diemTB);
        System.out.println("Xep loai : " + xepLoai(diemTB));
    }
}
