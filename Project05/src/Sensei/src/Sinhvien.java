import java.util.Scanner;

public class Sinhvien {
    // Trường dữ liệu
    private String maSV;
    private String hoTen;
    private double diemThi;
    private String xepLoai;
    //ham khong co tham so
    public Sinhvien(){

    }
    //ham tao co tham so
    public Sinhvien(String maSV, String hoTen,double diemThi, String xepLoai){
        this.maSV=maSV;
        this.hoTen=hoTen;
        this.diemThi=diemThi;
        this.xepLoai=xepLoai();
    }
    //nhap thong tin sinh vien
    public void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV=sc.nextLine();
        System.out.println("Nhap Ho va Ten: ");
        hoTen=sc.nextLine();
        System.out.println("Nhap diem thi: ");
        diemThi=sc.nextDouble();
        this.xepLoai=xepLoai();  // Tự động xếp loại sau khi nhập điểm
    }
    public void xuatDuLieu(){
        System.out.println("MaSV:"+maSV+"  Ho va Ten:"+hoTen+"  Diem Thi:"+diemThi+"  Xep Loai:"+xepLoai());
    }
    public String xepLoai(){
        if(diemThi<5){
            return "Yeu";
        } if(diemThi>=5 && diemThi<7){
            return "Trung Binh";
        }if(diemThi>=7 && diemThi<8){
            return "Kha";
        }
        return "Gioi";
    }
    public String getXepLoai (){
        return xepLoai;
    }
    public String getHoTen (){
        return hoTen;
    }
    public double getDiem(){
        return diemThi;
    }
}
