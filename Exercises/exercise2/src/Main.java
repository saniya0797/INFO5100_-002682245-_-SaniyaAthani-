public class Main {
    public static void main(String[] args) {
        //creating objects of subclasses of type baseclass "Shape"(using polymorphism concept)
        Shape t = new Triangle(5.0, 7.0, 9.0);
        Shape r = new Rectangle(21.0, 7.0);
        Shape c = new Circle(90.0);
        Shape s = new Square(55.0);

        //printing the area and perimeter of each subclass shape by calling methods of each class by their object
        System.out.println("The Area and perimeter of Shape " + t.getClass().getSimpleName() + " are as follows");
        System.out.println("Area: " + t.calculateArea());
        System.out.println("Perimeter: " + t.calculatePerimeter());
        System.out.println();
        System.out.println("The Area and perimeter of Shape " + r.getClass().getSimpleName() + " are as follows");
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
        System.out.println();
        System.out.println("The Area and perimeter of Shape " + c.getClass().getSimpleName() + " are as follows");
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Perimeter: " + c.calculatePerimeter());
        System.out.println();
        System.out.println("The Area and perimeter of Shape " + s.getClass().getSimpleName() + " are as follows");
        System.out.println("Area: " + s.calculateArea());
        System.out.println("Perimeter " + s.calculatePerimeter());
        System.out.println();
    }
}
