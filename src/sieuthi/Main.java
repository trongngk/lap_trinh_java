package sieuthi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        ArrayList<KhoHang> dsKhoHang = new ArrayList<>();
        ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
        while(true){
            System.out.println("\t_Menu_");
            System.out.println("1. Nhap san pham");
            System.out.println("2. Them khach hang");
            System.out.println("3. Sua thong tin khach hang");
            System.out.println("4. In kho hang");
            System.out.println("5. In hoa don");
            System.out.println("6. Sap xep thong tin khach hang");
            System.out.println("0. Thoat");
            System.out.println("Nhap lua chon: ");
            Scanner sc = new Scanner(System.in);
            int options = Integer.parseInt(sc.nextLine());
            switch(options){
                case 1:{
                    System.out.println("Nhap thong tin san pham ");
                    KhoHang khoHang = new KhoHang();
                    khoHang.nhap();
                    int flag = 0;
                    for (KhoHang x : dsKhoHang) {
                        if (x.getMaSp().equalsIgnoreCase(khoHang.getMaSp())) {
                            x.setSoLuong(x.getSoLuong() + khoHang.soLuong);
                            flag = 1;
                        }
                    }
                    if(flag == 0){
                        dsKhoHang.add(khoHang);
                    }
                }break;
                //
                case 2:{
                    System.out.println("Nhap thong tin khach hang ");
                    KhachHang khachHang = new KhachHang();
                    khachHang.nhap();
                    dsKhachHang.add(khachHang);
                }break;
                //
                case 3:{
                    System.out.print("Nhap ma khach hang can sua: ");
                    String maKhSua = sc.nextLine();
                    System.out.print("\t1. Sua ten khach hang\n");
                    System.out.print("\t2. Sua nam sinh khach hang\n");
                    int options2 = Integer.parseInt(sc.nextLine());
                    switch (options2) {
                        case 1:{
                            for(KhachHang kh : dsKhachHang){
                                if(kh.getMaKh().equalsIgnoreCase(maKhSua)){
                                    System.out.print("Nhap ten khach hang moi: ");
                                    kh.setTenKh(sc.nextLine());
                                }
                            }
                        }break;
                        case 2:{
                            for(KhachHang kh : dsKhachHang){
                                if(kh.getMaKh().equalsIgnoreCase(maKhSua)){
                                    System.out.print("Nhap nam sinh moi: ");
                                    kh.setNamSinh(sc.nextLine());
                                }
                            }
                        }break;
                    }
                }break;
                //
                case 4:{
                    for (KhoHang x : dsKhoHang) {
                        x.xuat();
                    }
                }break;
                //
                case 5:{
                    System.out.print("Nhap ma khach hang: ");
                    String maKh = sc.nextLine();
                    System.out.print("Nhap so san pham mua: ");
                    int  n = Integer.parseInt(sc.nextLine());
                    float tien = 0;
                    while (n>0){
                        System.out.print("Nhap ma san pham: ");
                        String maSp = sc.nextLine();
                        System.out.print("Nhap so luong: ");
                        int soLuong = Integer.parseInt(sc.nextLine());
                        for (KhoHang x : dsKhoHang) {
                            if(x.getMaSp().equalsIgnoreCase(maSp)){
                                if(soLuong > x.getSoLuong()){
                                    System.out.println("So luong khong du");
                                    return;
                                }
                                else{
                                    x.setSoLuong(x.getSoLuong() - soLuong);
                                    tien = tien + soLuong * x.getDonGia();
                                    HoaDon hd = new HoaDon(x.getMaSp(),x.getTenSp(),x.getDonGia(),x.getNgaySx(),soLuong,tien); 
                                    dsHoaDon.add(hd);
                                }
                            }
                            
                        }
                        for (KhachHang y: dsKhachHang){
                            if(y.getMaKh().equalsIgnoreCase(maKh)){
                                y.setTongTien(y.getTongTien() + tien);
                            }
                        }
                        n--;
                    }
                    for(HoaDon x: dsHoaDon){
                        x.xuat();
                    }
                }break;
                //
                case 6:{
                    // sắp xếp theo số tiền
                    for(int i = 0; i < dsKhachHang.size() - 1; i++){
                        for(int j = i + 1; j < dsKhachHang.size(); j++){
                            if(dsKhachHang.get(i).getTongTien() < dsKhachHang.get(j).getTongTien()){
                                KhachHang temp = dsKhachHang.get(i);
                                dsKhachHang.set(i, dsKhachHang.get(j));
                                dsKhachHang.set(j, temp);
                            }
                        }
                    }

                    for(KhachHang kh : dsKhachHang){
                        kh.xuat();
                    }
                }break;
                //
                case 0:{
                    System.exit(0);
                }break;
        }
    }
}}