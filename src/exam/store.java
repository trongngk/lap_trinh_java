
package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class store {
    Scanner sc = new Scanner(System.in);
    public int Max_items = 100;
    public static int total_items = 0;
    private ArrayList<book> list_item;


    public void addItem(){
        if(total_items < Max_items){
            book b = new book();
            System.out.print("Input ID: ");
            b.setID(sc.nextInt());
            sc.nextLine();
            System.out.print("Input name: ");
            b.setName(sc.nextLine());
            System.out.print("Input price: ");
            b.setPrice(sc.nextInt());
            total_items++;
        }
        else{
            System.out.println("The store is full");
        }
    }
    public void removeItem(int ID){
        
            for(book x: list_item){
                if(x.getID() == ID){
                    list_item.remove(x);
                    total_items--;
                    System.out.println("Remove success");
                }
                else{
                    System.out.println("Remove fail");
                }
            }
        
    }
    public void editItem(int ID) {
            for (book x: list_item){
                if(x.getID() == ID){
                    System.out.print("Input new name: ");
                    x.setName(sc.nextLine());
                    System.out.print("Input new price: ");
                    x.setPrice(sc.nextInt());
                    System.out.println("Edit success");
                }
                else{
                    System.out.println("Edit fail");
                }
            }
        
    }

    public void findItem(String name){
            for(book x: list_item)
            {
                if(x.getName().equalsIgnoreCase(name))
                {
                    System.out.println(x.toString());
                    break;
                }            
                else{
                    System.out.println("The book is not found");
                }
            }
        }
    
    public void showAllItems(){
            for (book x: list_item){
                x.toString();

            }
        
    }

}
