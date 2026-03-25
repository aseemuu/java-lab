public class Product {
    String pname, pcode;
    int price;

    public Product() {}

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public void setPrice(int price) {   
        this.price = price;
    }

    public String getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price);
    }
}

class cars {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.pcode = "car123";
        p1.pname = "maruthi";
        p1.price = 75000;

        System.out.println("Displaying p1: ");
        p1.display();

        Product p2 = new Product("benz", "car234", 67000);
        System.out.println("Displaying p2: ");
        p2.display();

        Product p3 = new Product("swift", "car456", 98000);
        System.out.println("Displaying p3: ");
        p3.display();

        // Finding product with lowest price
        Product p = (p1.price < p2.price) ?
                    (p1.price < p3.price ? p1 : p3) :
                    (p2.price < p3.price ? p2 : p3);

        System.out.println("\nDisplay product with lowest price :");
        p.display();
    }
}
