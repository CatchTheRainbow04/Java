import java.util.Scanner;

public class SinhVienNTU {
    private String name;
    private double score;
    public void NhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten sinh vien:");
        name = sc.nextLine();
        System.out.println("nhap vao diem trung binh:");
        score = sc.nextDouble();
    }
    public void XuatDuLieu(){
        System.out.println(name + "|" + score);
    }
    public double getScore (){
        return score;
    }
    public void setScore(double score){
        this.score = score;
    }
    public String getName (){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
}