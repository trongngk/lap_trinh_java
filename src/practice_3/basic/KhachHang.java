package practice_3.basic;

import java.util.Scanner;

public class KhachHang {
    String hoTenChuHo;
    String diaChi;
    String soCongToDien;
    KhachHang(){}
    KhachHang(String hoTenChuHo, String diaChi, String soCongToDien) {
        this.hoTenChuHo = hoTenChuHo;
        this.diaChi = diaChi;
        this.soCongToDien = soCongToDien;
    }
    void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten chu ho: ");
        this.hoTenChuHo = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap so cong to dien: ");
        this.soCongToDien = sc.nextLine();
    }
    
    public String showInfo(){
        return "Ho ten chu ho: " + this.hoTenChuHo + ", Dia chi: " + this.diaChi + ", so cong to dien: " + this.soCongToDien;
    }
}
