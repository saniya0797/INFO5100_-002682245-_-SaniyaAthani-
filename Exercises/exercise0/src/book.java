public class book {
    //creating 10 properties of the class
    int book_id; long edition; String title; String author; long published_year; long num_of_pages; String cover_type; String genre; String publisher; String size;
    //Constructor
    public book(int book_id, long edition, String title, String author, long published_year, long num_of_pages, String cover_type, String genre, String publisher, String size){
        System.out.println("Unique book id is "+book_id+" ,edition is:"+edition+" ,Title is:"+title+" ,Author is:"+author+" ,published year is: "+published_year+"Number of pages: "+num_of_pages+
                ", Cover type is: "+cover_type+" Genre: "+genre+" ,Publisher: "+publisher+" ,size of the book: "+size);
    }

    //creating 3 methods of the class
    public void read(){  //method1
        System.out.println("A read () has executed successfully");
    }
    public void book_mark(){  //method2
        System.out.println("A book_mark() has executed sucssesfully");
    }
    public void close(){   //method3
        System.out.println("A close() has executed succesfully");
    }
}