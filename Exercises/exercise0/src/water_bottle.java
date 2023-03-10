public class water_bottle {

    //creating 10 properties of the class
    int product_num;
    String color;
    String material;
    double price;
    double capacity;
    double height;
    double weight;
    String brand;
    boolean recyclable;
    boolean transparent;

    //Constructor
    public water_bottle(int product_num, String color, String material, double price, double capacity, double height, double weight, String brand, boolean recyclable, boolean transparent) {
        System.out.println("unique identification number for water bottle is " + product_num + " ,color is " + color + " ,material is " + material + " ,price is " + price + " ,capacity is " + capacity + " ,height in inches are " + height + " ,weight in lb " + weight + " brand " + brand + " ,is recyclable" + recyclable + ", is transparent:" + transparent);
    }

    //creating 3 methods of the class
    public void pour() {  //method1
        System.out.println("A pour() executed successfully");
    }

    public void drink() {  //method2
        System.out.println("A drink() executed successfully");
    }

    public void empty() {  //method3
        System.out.println("A empty() executed successfully");
    }
}