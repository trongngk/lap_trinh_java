package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        store store = new store();
        
        while(true)
        {
            System.out.println("Menu");
            System.out.println("1. Add a new book");
            System.out.println("2. Edit a book");
            System.out.println("3. Delete a book");
            System.out.println("4. Search a book");
            System.out.println("5. Show all books");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("You have chosen to add a new book");
                    store.addItem();
                    break;
                case 2:
                    System.out.println("You have chosen to edit a book");
                    System.out.println("Enter the book id: ");
                    int id = scanner.nextInt();
                    store.editItem(id);
                    break;
                case 3:
                    System.out.println("You have chosen to remove a book");
                    System.out.print("Enter the book id: ");
                    int ID = scanner.nextInt();
                    store.removeItem(ID);
                    break;
                case 4:
                    System.out.println("You have chosen to find a book");
                    System.out.println("Enter the book name: ");
                    String name = scanner.next();
                    store.findItem(name);
                    break;
                case 5:
                    System.out.println("You have chosen to show all books");
                    store.showAllItems();
                    break;
                case 6:
                    System.out.println("You have chosen to exit");
                    System.exit(0);
            }
        }
    }

}