public class desk {
    //creating 10 properties of the class
    int desk_id; String color; String material; double price; float height; float weight; float width; String model; String brand; boolean foldable ;

    //constructor
    public desk(int desk_id, String color, String material, double price, double height, double weight, double width, String model, String brand, boolean foldable ){
        System.out.println("Unique id of Desk: "+desk_id+" ,Color: "+color+" ,Material used: "+material+" ,Price:"+price+" ,Height and width in inches are: "+height+" ,"+width+" ,weightin lb: "+weight+" ,Model is; "+model+" ,brand is: "+brand+" ,is it foldable?: "+foldable);
    }

    //creating 3 methods of the class
    public void set_a_location(){ //method1
        System.out.println("A set_a_location() executed successfully");
    }
    public void keep_stuff(){  //method2
        System.out.println("A keep_stuff() executed successfully");
    }
    public void use_for_study(){  //method3
        System.out.println("A use_for_study() executed successfully");
    }
}