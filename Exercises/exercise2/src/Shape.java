 public abstract class Shape {               //abstract Base class
    public static final double pi = 3.14;       //creating static variable
    public abstract double calculateArea();       //creating abstract method1
    public abstract double calculatePerimeter();   //creating abstract method2

    public void getclassName() {
        System.out.println(getClass().getSimpleName());
    }

}

 class Triangle extends Shape {             //creating sub class for base absrtact class
    private double side1, side2, side3;

    public Triangle (double side1, double side2, double side3) {   //Constructor with parameters
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {               //implementing and overriding abstract method1 in subclass
        double semi_perimeter=(side1+side2+side3)/2;
        return Math.sqrt(semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3)) ;
    }

    @Override
    public double calculatePerimeter() {          //implementing and overriding abstract method2 in subclass
        return side1 + side2 + side3;
    }
}

 class Rectangle extends Shape {               //creating sub class for absrtact base class
    private double length, width;

    public Rectangle( double length, double width) {     //Constructor with parameters
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {          //implementing and overriding abstract method1 in subclass
        return length * width;
    }

    @Override
    public double calculatePerimeter() {         //implementing and overriding abstract method2 in subclass
        return 2 * (length + width);
    }
}

 class Circle extends Shape {             //creating sub class for absrtact base class
    private double radius;

    public Circle( double radius) {      //Constructor with parameter

        this.radius = radius;
    }
    @Override
    public double calculateArea() {         //implementing and overriding abstract method1 in subclass

        return pi * radius * radius;
    }
    @Override
    public double calculatePerimeter() {       //implementing and overriding abstract method2 in subclass
        return 2 * pi * radius;
    }
}

 class Square extends Shape {                 // creating sub class for absrtact base class
    private double side;

    public Square( double side) {            //Constructor with parameter

        this.side = side;
    }

     @Override
    public double calculateArea() {              //implementing and overriding abstract method1 in subclassass
        return side * side;
    }

    @Override
    public double calculatePerimeter() {           //implementing and overriding abstract method2 in subclass

        return 4 * side;
    }
}

