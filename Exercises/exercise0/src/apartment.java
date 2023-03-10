public class apartment {

    //creating 10 properties of apartment
    String apartment_name;
    int apartment_number;
    String address;
    int pincode;
    double size_sqft;
    int number_of_bedrooms;
    double rent;
    int floor_no;
    boolean amenities;
    boolean pet_friendly;

    //creating constructor of class
    public apartment(String apartment_name, int apartment_number, String address, int pincode, double size_sqft, int number_of_bedrooms, double rent, int floor_no, boolean amenities, boolean pet_friendly) {
        System.out.println("apartment name is " + apartment_name + ", apartment number " + apartment_number + ", the address is  " + address + " ,pincode is: " + pincode + " ,sqft area is:" + size_sqft + " ,number of bedrooms are: " + number_of_bedrooms + " ,rent is: " + rent + " ,floor plan is:" + floor_no + " ,are amenities available: " + amenities + " ,is it pet_friendly: " + pet_friendly);
    }

    //creating 3 methods for the class
    public void living_area() {
        System.out.println("A living_area() executed successfully");
    } //method1

    public void kitchen() {
        System.out.println("A kitchen() executed successfully");
    }  //method2

    public void bedroom() {
        System.out.println("A bedroom() executed successfully");
    }  //method3

    void disp() {
        choice1_of_apartment choice1 = new choice1_of_apartment(this);
        choice1.live();
    }

    void disp2() {
        choice2_of_apartment choice2 = new choice2_of_apartment(this);
        choice2.sublease();
    }

    private class choice1_of_apartment {         //creating nested class1

        //creating methods inside the class
        private choice1_of_apartment(apartment var1) {
        }
        void live() {
            System.out.println("Living in apartment in 1st innerclass of apartment");
        }
    }

    private class choice2_of_apartment {         //creating nested class2

        //creating methods inside the class
        private choice2_of_apartment(apartment var1) {
        }
        void sublease() {
            System.out.println("Subleasing apartment in 2nd inner class of apartment");
        }
    }
}
