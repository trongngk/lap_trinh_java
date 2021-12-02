package practice_3.basic;

import java.util.Scanner;

public class ThuVien extends SinhVien {
        String soPhieuMuon;
        String ngayMuon;
        String ngayTra;
        String maSach;
    
        ThuVien() {
        }
    
        ThuVien(String soPhieuMuon, String ngayMuon, String ngayTra, String maSach) {
            this.soPhieuMuon = soPhieuMuon;
            this.ngayMuon = ngayMuon;
            this.ngayTra = ngayTra;
            this.maSach = maSach;
        }
    
        ThuVien(String soPhieuMuon, String ngayMuon, String ngayTra, String maSach, String hoTen, int namSinh, int tuoi, String lop) {
            super(hoTen, namSinh, tuoi, lop);
            this.soPhieuMuon = soPhieuMuon;
            this.ngayMuon = ngayMuon;
            this.ngayTra = ngayTra;
            this.maSach = maSach;
        }
    
        String getSoPhieuMuon() {
            return soPhieuMuon;
        }
    
        void setSoPhieuMuon(String soPhieuMuon) {
            this.soPhieuMuon = soPhieuMuon;
        }
    
        String getNgayMuon() {
            return ngayMuon;
        }
    
        void setNgayMuon(String ngayMuon) {
            this.ngayMuon = ngayMuon;
        }
    
        String getNgayTra() {
            return ngayTra;
        }
    
        void setNgayTra(String ngayTra) {
            this.ngayTra = ngayTra;
        }
    
        String getMaSach() {
            return maSach;
        }
    
        void setMaSach(String maSach) {
            this.maSach = maSach;
        }
    
        @Override
        public String getHoTen() {
            return hoTen;
        }
    
        @Override
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
    
        @Override
        public int getNamSinh() {
            return namSinh;
        }
    
        @Override
        public void setNamSinh(int namSinh) {
            this.namSinh = namSinh;
        }
    
        @Override
        public int getTuoi() {
            return tuoi;
        }
    
        @Override
        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }
    
        @Override
        String getLop() {
            return lop;
        }
    
        @Override
        void setLop(String lop) {
            this.lop = lop;
        }
        @Override
        void getInfo(){
            Scanner Input=new Scanner(System.in);
            System.out.print("Nhap so phieu muon: ");
            this.soPhieuMuon=Input.nextLine();
            System.out.print("Nhap ngay muon: ");
            this.ngayMuon=Input.nextLine();
            System.out.print("Nhap ngay tra: ");
            this.ngayTra=Input.nextLine();
            System.out.print("Nhap ma sach: ");
            this.maSach=Input.nextLine();
            super.getInfo();
        }
    
        @Override
        public String toString() {
            return super.toString()+"\nThuVien{" + " soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + ", maSach=" + maSach + '}';
        }
        
    }
