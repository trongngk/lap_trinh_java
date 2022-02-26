package Java_final_exam;

public class SinhvienATTT extends Sinhvien{
    public Float hocPhi;
    //
    public SinhvienATTT(){}
    public SinhvienATTT(String maSv, String hoTen, String ngaySinh, String gioiTinh, Float diemTb, Float hocPhi){
        super(maSv, hoTen, ngaySinh, gioiTinh, diemTb);
        this.hocPhi = hocPhi;
    }
    //
    @Override
    public String toString() {
        return "SinhvienATTT: " + super.toString() + ", " + hocPhi;
    }
    
    
}
