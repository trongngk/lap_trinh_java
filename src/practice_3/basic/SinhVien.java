package practice_3.basic;

import java.util.Scanner;

public class SinhVien {
    String hoTen;
    int namSinh;
    int tuoi;
    String lop;

    SinhVien() {
    }

    SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    String getHoTen() {
        return hoTen;
    }

    void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    int getNamSinh() {
        return namSinh;
    }

    void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    int getTuoi() {
        return tuoi;
    }

    void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    String getLop() {
        return lop;
    }

    void setLop(String lop) {
        this.lop = lop;
    }
    void getInfo(){
        Scanner Input=new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen=Input.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh=Input.nextInt();
        System.out.print("Nhap tuoi: ");
        this.tuoi=Input.nextInt();
        Input.nextLine();
        System.out.print("Nhap lop: ");
        this.lop=Input.nextLine();
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + ", lop=" + lop + '}';
    }
}
