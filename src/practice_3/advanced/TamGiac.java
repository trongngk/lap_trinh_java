package practice_3.advanced;

import java.util.Scanner;

public class TamGiac extends DaGiac {
    @Override 
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so canh: ");
        this.soCanh =  sc.nextInt();
        while(this.soCanh < 3) {
            System.out.print("So canh phai lon hon 3. Nhap lai: ");
            this.soCanh =  sc.nextInt();
        }
        this.canh = new int[soCanh];
        System.out.print("Nhap canh: ");
        for(int i = 0; i < soCanh; i++){
            this.canh[i] = sc.nextInt();
        }
        
    }
    @Override
    void giaTriCacCanh() {
        super.giaTriCacCanh();
    }
    @Override
    int tinhChuVi() {
        return super.tinhChuVi();
    }
    @Override
    void ketQua() {
        super.ketQua();
    }
    
}
