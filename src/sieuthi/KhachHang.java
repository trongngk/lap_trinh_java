package sieuthi;

import java.util.Scanner;

public class KhachHang {
    String maKh;
    String tenKh;
    String namSinh;
    String diaChi;
    float tongTien;
    
    public KhachHang(){}
    public KhachHang(String MaKh, String tenKh, String namSinh, String diaChi){
        this.maKh = MaKh;
        this.tenKh = tenKh;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }
    // get, set
    public String getMaKh() {
        return maKh;
    }
    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }
    public String getTenKh() {
        return tenKh;
    }
    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
    public String getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public float getTongTien() {
        return tongTien;
    }
    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    // Nhap thong tin khach hang
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        this.maKh = sc.nextLine();
        System.out.print("Nhap ten khach hang: ");
        this.tenKh = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        tongTien = 0;
    }
    // Xuat thong tin khach hang
    public void xuat(){
        System.out.println("Ma khach hang: " + this.maKh);
        System.out.println("Ten khach hang: " + this.tenKh);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("So tien da mua: " + this.tongTien);
    }
}
