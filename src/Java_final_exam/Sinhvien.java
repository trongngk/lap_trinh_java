package Java_final_exam;

public class Sinhvien {
    public String maSv;
    public String hoTen;
    public String ngaySinh;
    public String gioiTinh;
    public Float diemTb;
    //
    public Sinhvien(){}
    public Sinhvien(String maSv, String hoTen, String ngaySinh, String gioiTinh, Float diemTb){
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTb = diemTb;
    }
    public String getMaSv() {
        return maSv;
    }
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public Float getDiemTb() {
        return diemTb;
    }
    public void setDiemTb(Float diemTb) {
        this.diemTb = diemTb;
    }
    //
    @Override
    public String toString() {
        return maSv + ", " + hoTen + ",  " + ngaySinh + ", " + gioiTinh + ", " + diemTb;
    }
    
}

