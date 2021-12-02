package practice_3.basic;

import java.util.Scanner;

public class BienLai extends KhachHang {
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int thanhTien;
    BienLai(){}
    BienLai(int chiSoCu, int chiSoMoi, int thanhTien) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.thanhTien = thanhTien;
    }
    @Override
    void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chi so cu: ");
        this.chiSoCu = scanner.nextInt();
        System.out.print("Nhap chi so moi: ");
        this.chiSoMoi = scanner.nextInt();
        super.getInfo();
    }
    void tinhTienDien() {
        this.thanhTien = (this.chiSoMoi - this.chiSoCu) * 850000;
    }
    @Override
    public String showInfo() {
        return super.showInfo() + "\nBang bien lai: " + ", chi so cu: " + this.chiSoCu  + ", chi so moi: " + this.chiSoMoi + ", thanh tien: " + this.thanhTien;
    }
}
