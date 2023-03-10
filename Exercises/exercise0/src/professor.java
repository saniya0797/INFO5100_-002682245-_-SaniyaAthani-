
public class professor {

    //creating 10 properties of class
    int prof_id; String Prof_name; String subject; double salary; float rating; String address; float advising_hrs; int num_of_subject; double year_of_experience; String email_id;

    //Constructor of class
    public professor(int prof_id, String prof_name, String subject, double salary, double rating, String address, String advising_hrs, int num_of_subject, double year_of_experience, String email_id) {
        System.out.println("unique id of professor " + prof_id + " ,Professor name is " + prof_name + " ,Subject they teach is " + subject + " ,salary is " + salary + " ,rating the recieve is " + rating + " ,address is " + address + " ,advising hours is" + advising_hrs + " ,Number of subject they teach are, " + num_of_subject + " ,Year of experience they have " + year_of_experience + " ,emaid_id is" + email_id);

    }

    //creating 3 methods of the class
    public void teach(){   //method1
        System.out.println("A teach() method successfully executed");
    }
    public void give_assignment(){ //method2
        System.out.println("A give_assignment() method successfully executed");

    }
    public void check_assignment(){  //method3
        System.out.println("A check_assignment() method successfully executed");
    }
}