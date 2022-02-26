package exam;


public class book {
    int ID;
    String name;
    int price;
    public int getID() {
        return this.ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public book(){ }

    public book(int ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + ID + ", name=" + name + ", price=" + price + '}';
    }
}
