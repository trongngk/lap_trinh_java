package practice_2.basic;

import java.util.Scanner;

public class exercise_3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int ngay, thang, nam;
        System.out.print("Nhap nam: ");
        nam = input.nextInt();
        do{
            System.out.print("Nhap thang: ");
            thang = input.nextInt();
        }while(thang < 1 || thang > 12);
        int soNgay = soNgayTrongThang(thang, nam);
        do{
            System.out.print("Nhap ngay: ");
            ngay = input.nextInt();
        }while(ngay < 1 || ngay > soNgay);

        System.out.println("Ngay " + ngay + "/" + thang + "/" + nam + " la ngay " + ngayTrongNam(ngay, thang, nam));

    }

    // kiem tra nam nhuan
    public static boolean namNhuan(int nam) {
        if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // tinh so ngay trong thang
    public static int soNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (namNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    public static int ngayTrongNam(int ngay, int thang, int nam) {
        for (int i = 1; i < thang; i++) {
            ngay += soNgayTrongThang(i, nam);
        }
        return ngay;
    }

}

