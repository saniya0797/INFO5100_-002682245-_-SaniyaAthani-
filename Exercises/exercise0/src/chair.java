public class chair {
    //creating 10 properties of the class
    int product_num;
    String model;
    String material;
    String color;
    String brand;
    double height;
    double width;
    double depth;
    double weight;
    boolean is_flexible;

    //constuctor
    public chair(int product_num, String model, String material, String color, String brand, double height, double width, double depth, double weight, boolean is_flexible) {
        System.out.println("unique instance of chair is product number: " + product_num + "Model is: " + model + " ,material is: " + material + " ,color is:" + color + " ,brand is: " +
                brand + "height,weight,depth in inches: " + height + " ," + width + " ," + depth + " ,weight in lbs: " + weight + " ,is it flexible:" + is_flexible);
    }
    //creating 3 methods of the class
    public void sit_on() {  //method1
        System.out.println(" A sit_on() method executed successfully");
    }

    public void adjust_height() {  //method2
        System.out.println("A adjust_height() method executed successfully");
    }

    public void rotate() {  //method3
        System.out.println("A rotate() method executed successfully");
    }
}

