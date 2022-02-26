package sieuthi;

import java.util.Scanner;

public class SanPham {
    String maSp;
    String tenSp;
    float donGia;
    String ngaySx;
    //
    public SanPham(){}
    public SanPham(String MaSp, String tenSp, float donGia, String ngaySx){
        this.maSp = MaSp;
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.ngaySx = ngaySx;
    }
    // get, set
    public String getMaSp() {
        return maSp;
    }
    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public String getNgaySx() {
        return ngaySx;
    }
    public void setNgaySx(String ngaySx) {
        this.ngaySx = ngaySx;
    }
    // Nhap thong tin san pham
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        this.maSp = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        this.tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap ngay san xuat: ");
        this.ngaySx = sc.nextLine();
    }

    // Xuat thong tin san pham
    public void xuat(){
        System.out.println("Ma san pham: " + this.maSp);
        System.out.println("Ten san pham: " + this.tenSp);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Ngay san xuat: " + this.ngaySx);
    }
    
}
