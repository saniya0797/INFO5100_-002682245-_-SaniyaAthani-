public class computer {
    //creating 10 properties of the class
    int computer_id; int memory; String processor; String brand; String model_no; String os; int storage; String color; double screen_size; String webcam_type;

    //constructor
    public computer(int computer_id, int memory, String processor, String brand, String model_no, String os, int storage, String color, double screen_size, String webcam_type){

        System.out.println("class computer created with unique computer_id "+computer_id+" , memory is: "+memory+" ,Processor is: "+processor+
                " ,Brand is: "+brand+", Model Number is: "+model_no+" Opertaing System is: "+os+", storage is: "+storage+", color is: "+color+" ,screen_size is: "+screen_size+"webcam type is:"+webcam_type);
    }

    //creating 3 methods of the class
    public void coding(){  //method1
        System.out.println("A coding() executed successfully");
    }
    public void gaming(){  //method2
        System.out.println("A gaming() executed successfully");
    }
    public void entertainment(){  //method3
        System.out.println("A entertainment() executed successfully");

    }

}