package practice_3.advanced;

import java.util.Scanner;

public class DaGiac {
    int soCanh;
    int[] canh ;
    DaGiac(){};
    DaGiac(int soCanh, int[] canh){
        this.soCanh = soCanh;
        this.canh = canh;
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so canh: ");
        this.soCanh =  sc.nextInt();
        this.canh = new int[soCanh];
        System.out.print("Nhap canh: ");
        for(int i = 0; i < soCanh; i++){
            this.canh[i] = sc.nextInt();
        }
    }
    void giaTriCacCanh(){
        System.out.print("Gia tri cac canh: ");
        for(int i = 0; i < soCanh; i++){
            System.out.print(canh[i] + " ");
        }
    }
    int tinhChuVi(){
        int chuVi = 0;
        for(int i = 0; i < soCanh; i++){
            chuVi += canh[i];
        }
        return chuVi;
    }
    void ketQua(){
        giaTriCacCanh();
        System.out.println("\nChu vi: " + tinhChuVi());
    }

}
