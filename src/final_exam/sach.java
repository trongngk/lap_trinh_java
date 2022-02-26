package final_exam;

import java.util.Scanner;

public class sach extends Book{
    String author;
    int pageNum;

    public sach() {
    }
    public sach(String bookId, String nxbName, int count, String author, int pageNum) {
        super(bookId, nxbName, count);
        this.author = author;
        this.pageNum = pageNum;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tac gia: ");
        this.author = input.nextLine();
        System.out.println("Nhap so trang: ");
        this.pageNum = input.nextInt();
        input.nextLine();   
    }
    @Override
    public String toString() {
        return "sach[" +super.toString()+"author=" + author + ", pageNum=" + pageNum + "]";
    }
}
