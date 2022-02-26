package Java_final_exam;

public class SinhvienMatMa extends Sinhvien{
    public String donVi;
    //
    public SinhvienMatMa(){}
    public SinhvienMatMa(String maSv, String hoTen, String ngaySinh, String gioiTinh, Float diemTb, String donVi) {
        super(maSv, hoTen, ngaySinh, gioiTinh, diemTb);
        this.donVi = donVi;
    }
    //
    public String getDonVi() {
        return donVi;
    }
    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    //
    @Override
    public String toString() {
        return "SinhvienMatMa: " + super.toString() + ", " + donVi;
    }
    
    
}
