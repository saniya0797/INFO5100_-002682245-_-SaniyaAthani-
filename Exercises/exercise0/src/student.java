public class student {
   //creating 10 properties of the class
    int student_id; String f_name; String l_name; String email_id; long phone_no; String address; String course; char grade;

    //creating constructor
    public student(int student_id, String f_name, String l_name, String email_id, long phone_no, String address, String course, char grade){
        System.out.println("class student created with unique student_id "+student_id+" ,first name is: "+f_name+" ,last name is: "+l_name+" ,student emaid id is: "+email_id
                +"Phone number is: "+phone_no+" ,Address is: "+address+" ,course taken is: "+course+" ,Grade recieved is: "+grade);
    }

    //creating 3 methods of the class
    public void study(){    //method1
        System.out.println("A study() executes successfully");
    }
    public void assignment(){    //method2
        System.out.println("A assignment() executed successfully");
    }

    public void listen_to_lecture(){  //method3
        System.out.println("A listen_to_lecture() executed successfully");
    }


}