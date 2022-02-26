package final_exam;

import java.util.Scanner;

public class magazine extends Book{
    String ngayPhatHanh;
    String thangPhatHanh;

    public magazine() {
    }
    public magazine(String bookId, String nxbName, int count, String ngayPhatHanh, String thangPhatHanh) {
        super(bookId, nxbName, count);
        this.ngayPhatHanh = ngayPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }
    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }
    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    public String getThangPhatHanh() {
        return thangPhatHanh;
    }
    public void setThangPhatHanh(String thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh: ");
        this.ngayPhatHanh = input.nextLine();
        System.out.println("Nhap thang phat hanh: ");
        this.thangPhatHanh = input.nextLine();
        input.nextLine();
    }
    @Override
    public String toString(){
        return "magazine[" + super.toString() + ", ngayPhatHanh=" + ngayPhatHanh + ", thangPhatHanh=" + thangPhatHanh + "]";
    }
}
