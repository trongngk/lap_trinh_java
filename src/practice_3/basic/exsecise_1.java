package practice_3.basic;

import java.util.Scanner;

public class exsecise_1 {
    public static void main(String[] args) {
        Pepole person = new Pepole();
        person.getInfo();
        person.showInfo();
    }
}

class Pepole {
    public String name;
    public String address;
    public int birthYear;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void getInfo() {
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