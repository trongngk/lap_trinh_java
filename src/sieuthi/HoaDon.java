package sieuthi;

public class HoaDon extends SanPham{
    int soLuongMua;
    float thanhTien;
    //
    public HoaDon(){}
    public HoaDon(String MaSp, String tenSp, float donGia, String ngaySx, int soLuongMua, float thanhTien){
        super(MaSp, tenSp, donGia, ngaySx);
        this.soLuongMua = soLuongMua;
        this.thanhTien = thanhTien;
    }
    public int getSoLuongMua() {
        return soLuongMua;
    }
    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }
    public float getThanhTien() {
        return thanhTien;
    }
    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So luong mua: " + this.soLuongMua);
        System.out.println("Thanh tien: " + this.thanhTien);
    }
}
