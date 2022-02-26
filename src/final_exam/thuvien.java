package final_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class thuvien {
    ArrayList<Book> listBook = new ArrayList<>();
    public thuvien() {
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("1.Nhap thong tin");
            System.out.println("2.Hien thi thong tin");
            System.out.println("3.Tim kiem tai lieu");
            System.out.println("0.Thoat");
            int option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("Nhap thong tin sach");
                    System.out.println("Nhap thong tin tap chi");
                    int option1 = input.nextInt();
                    switch(option1){
                        case 1:{
                            sach s = new sach();
                            s.inputInfo();
                            listBook.add(s);
                        } break;
                        case 2:{
                            magazine m = new magazine();
                            m.inputInfo();
                            listBook.add(m);
                        } break;
                    } break;
                case 2:
                    System.out.println("Danh sach sach");
                    System.out.println("Danh sach tap chi");
                    int option2 = input.nextInt();
                    switch(option2){
                        case 1:{
                            for(Book b : listBook){
                                if(b instanceof sach){
                                    System.out.println(b.toString());
                                }
                            }
                        } break;
                        case 2:{
                            for(Book b : listBook){
                                if(b instanceof magazine){
                                    System.out.println(b.toString());
                                }
                            }
                        } break;
                    }
                    break;
                case 3:
                    System.out.println("Nhap sach can tim kiem");
                    System.out.println("Nhap tap chi can tim kiem");
                    int option3 = input.nextInt();
                    switch(option3){
                        case 1:{
                            System.out.println("Nhap ma sach can tim kiem");
                            input.nextLine();
                            String str = input.nextLine();
                            for(Book b : listBook){
                                if(b instanceof sach){
                                    if(b.getBookId().equalsIgnoreCase(str)){
                                        System.out.println(b.toString());
                                    }
                                    else{
                                        System.out.println("Khong tim thay");
                                    }
                                }
                                else{
                                    System.out.println("Khong tim thay#1");
                                }
                            }
                        } break;
                        case 2:{
                            System.out.println("Nhap ma tap chi can tim kiem");
                            String str = input.nextLine();
                            for(Book b : listBook){
                                if(b instanceof magazine){
                                    if(b.getBookId().equalsIgnoreCase(str)){
                                        System.out.println(b.toString());
                                    }
                                }
                            }
                        } break;
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;
            }
        }

    }
    
}
