package practice_3.basic;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Pepole person = new Pepole();
        person.getInfo();
        person.showInfo();
    }
}

class Pepole {
    String name;
    String address;
    int birthYear;
    void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.birthYear = scanner.nextInt();
    }
    public void showInfo() {
        System.out.println("Name: " + this.name + " , Address: " + this.address + " , BirthYear: " + this.birthYear);
    }
}