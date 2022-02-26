package sieuthi;

import java.util.Scanner;

public class KhoHang extends SanPham{
    int soLuong;

    public KhoHang() {
    }
    public KhoHang(String MaSp, String tenSp, float donGia, String ngaySx, int soLuong) {
        super(MaSp, tenSp, donGia, ngaySx);
        this.soLuong = soLuong;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so luong: ");
        this.soLuong = Integer.parseInt(new Scanner(System.in).nextLine());
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So luong: " + this.soLuong);
    }
    
}
