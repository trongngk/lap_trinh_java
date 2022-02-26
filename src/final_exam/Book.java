package final_exam;

import java.util.Scanner;

public class Book {
    String bookId;
    String nxbName;
    int count;

    public Book(){}
    public Book(String bookId, String nxbName, int count) {
        this.bookId = bookId;
        this.nxbName = nxbName;
        this.count = count;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getNxbName() {
        return nxbName;
    }
    public void setNxbName(String nxbName) {
        this.nxbName = nxbName;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");
        this.bookId = input.nextLine();
        System.out.println("Nhap ten nha xuat ban: ");
        this.nxbName = input.nextLine();
        System.out.println("Nhap so ban phat hanh: ");
        this.count = input.nextInt();
        input.nextLine();
    }
    @Override
    public String toString() {
        return "bookId=" + bookId + ", nxbName=" + nxbName + ", count=" + count;
    }
}
