public class vehicle {

    //creating 10 properties of the class
    long registration_no; String type_of_vehicle; String color; String model_no; String manufacturer; int occupancy; String type_of_fuel; double mileage; int max_speed; int no_of_vehicle;

    //Constructor
    public vehicle( long registration_no, String type_of_vehicle, String color, String model_no, String manufacturer, int occupancy, String type_of_fuel, double mileage, int max_speed, int no_of_wheels){
        System.out.println("unique registration number for vehicle is"+registration_no+" ,Type of vehicle:"+type_of_vehicle+" ,color: "+color+" ,model_number: "+model_no+" ,Manufacturer: "+manufacturer+" ,Occupancy of people: "+occupancy+" ,type_of_fuel_used: "+type_of_fuel+" ,Mileage: "+mileage+" ,Maximum Speed: "+max_speed+" ,Number of wheels: "+no_of_wheels);
    }

    //creating 3 methods of the class
    public void drive() {  //method1
        System.out.println("Drive() executed without error");
    }
    public void stop(){   //method2
        System.out.println("Stop() executed without error");

    }
    public void park(){    //method3
        System.out.println("Park() executed without error");

    }
}
