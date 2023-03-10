
public class mobile {
//creating 10 properties of the class
    int mobile_id;
    String manufacturer;
    String color;
    String model_no;
    int memory_inGB;
    double screen_size;
    String screen_glass;
    String camera_quality;
    int num_of_camera;
    String operating_systems;

    //Constructor of class
    public mobile( int mobile_id, String manufacturer, String color, String model_no,int memory_inGB,
                   double screen_size, String screen_glass, String camera_quality,int num_of_camera, String operating_systems){
        System.out.println("unique identification number for mobile is " + mobile_id + " ,Maufacturer: " + manufacturer + " ,Color is: " + color + " ,Model_number: " + model_no +
                " ,Memory: " + memory_inGB + " ,screen_size: " + screen_size + " ,Screen glass type: " + screen_glass + " ,camera quality is: " + camera_quality + " Number of Cameras: " + num_of_camera + ", Operating system is: " + operating_systems);


    }
    //creating 3 methods of the class
    public void call () {  //method1
        System.out.println("A call() method executed successfully");
    }
    public void receive_call () {  //method2
        System.out.println("A receive_call() executed successfully");

    }
    public void hang_up () {   //method3
        System.out.println("A hung_up() executed successfully");
    }
}
