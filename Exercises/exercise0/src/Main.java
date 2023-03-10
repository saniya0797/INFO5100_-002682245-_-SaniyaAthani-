public class Main {
        public static void main(String[] args) {  //Main method

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in student class
            System.out.println("********************************* STUDENT **********************************");
            student std = new student(01, "john", "ibrahim", "john@gmailcom", 6822331, "1821 _S_road","Masters", 'A');
            student std1 = new student(02, "jolly", "saxena", "j.saxena@gmailcom", 7276366, "1921 _N_road","Bachelors", 'B');
            student std2 = new student(03, "johny", "Patel", "j.patel@gmailcom", 9986431, "1721 _W_road","Doctrate", 'A');
            std.assignment(); std1.study();std2.listen_to_lecture();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in computer class
            System.out.println("********************************* Computer **********************************");
            computer cmp= new computer(11,8,"intel","HP","144_hp", "windows7",256,"silver",15.6, "internal");
            computer cmp2= new computer(12,16,"ryzen6","Dell","145_dell", "windows11",526,"Pink",14.6, "external");
            computer cmp3= new computer(13,32,"Ryzen 7","Lenovo","789_len", "windows 8",1000,"Matt black",13, "internal & external");
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in Apartment class
            System.out.println("********************************* Apartment **********************************");
            apartment apt=new apartment( "Ascend",101,"north-san jose", 95199, 691, 1,2500,1,true,true);
            apartment apt1=new apartment( "Aspire",111,"south milpitas 1821", 95035, 731, 2,2700,1,false,false);
            apartment apt2=new apartment( "Crescent",307,"1011 Zanker_rd", 95175, 874, 3,3600,4,false,true);
            apt.bedroom(); apt.kitchen(); apt.living_area();apt.disp();apt.disp2();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in Desk class
            System.out.println("********************************* Desk *********************************");
            desk dsk=new desk(001,"brown","wooden",500,11.5,25,15.4,"d_001","kirkland",true);
            desk dsk2=new desk(002,"black","Ceramic",1100,14,55,16.0,"br_991","Original",false);
            desk dsk3=new desk(003,"Neutral","Iron",1500,20.2,50,20.3,"ne_701","Evergreen",true);
            dsk.keep_stuff(); dsk.set_a_location(); dsk.use_for_study();
            System.out.println(" ");


            //Printing a statement in constructor to indicate creation of each instance,for 3objects in professor class
            System.out.println("********************************* Professor **********************************");
            professor prof=new professor(100,"Taral Oza","INFO5100",6000,4.5,"san jose downtown","12pm-1pm",3,11.5,"oza@northeastern.edu");
            professor prof1=new professor(101,"Herreo j","TELE6510",1000,4.0,"Boston downtown","2pm-4pm",1,12,"herrero@northeastern.edu");
            professor prof2=new professor(102,"Drew Ochengco","ENCP600",1500,4.5,"san jose downtown","11am-1pm",2,10,"drew@northeastern.edu");

            prof.teach();prof.give_assignment();prof.check_assignment();
            System.out.println(" ");


        //Printing a statement in constructor to indicate creation of each instance,for 3objects in Book class
            System.out.println("********************************* Book **********************************");
            book bk=new book(1,2004,"Java prpogramming","O'reilly",2001,850,"hard cover","non-fiction","Mcbook","king-size");
            book bk1=new book(2,2010,"IoT basic","Peter Riely",2000,750,"soft cover","non-fiction","Mcbook","large-size");
            book bk2=new book(3,1998,"Sapiens","Yuval Noah",1998,850,"hard cover","fiction","Harper","regular size");
            bk.read();bk.book_mark();bk.close();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in Vehicle class
            System.out.println("********************************* Vehicle **********************************");
            vehicle vhc=new vehicle(50215,"electric","white","ts145","tesla",4,"electric charge",252,120,4);
            vehicle vhc1=new vehicle(62115,"Hybrid","musturd_color","IR55","I-RAM",6,"Charge/Gas",500,100,4);
            vehicle vhc2=new vehicle(72865,"Gasoline","Blue","M8","Mazda",4,"Gosoline",850,800,4);
            vhc.drive();vhc.park();vhc.stop();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in waterbottle class
            System.out.println("********************************* Water_botlle **********************************");
            water_bottle wb=new water_bottle(01,"white","plastic",20,4.5,15.0,2,"kirkland",true,true);
            water_bottle wb1=new water_bottle(02,"Black","Steel",26,2,10.0,3,"China",true,false);
            water_bottle wb2=new water_bottle(03,"Green","Copper",30,5,18.0,4,"Eaves",true,false);
            wb.pour();wb.drink();wb.empty();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in chair class
            System.out.println("********************************* Chair **********************************");
            chair ch=new chair(01,"ch512","leather","black","ergonomic",20,25,30,25,true);
            chair ch1=new chair(11,"ch513","Wood","White","kirkland",35,28,38,28,false);
            chair ch2=new chair(21,"ch515","Iron","Blue","Easy_make",21,24,40,25.5,false);
            ch.adjust_height();ch.rotate();ch.sit_on();
            System.out.println(" ");

            //Printing a statement in constructor to indicate creation of each instance,for 3objects in mobile class
            System.out.println("********************************* Mobile **********************************");
            mobile mob=new mobile(111,"apple","blue","14_pro",64,5.4,"gorila","HD",4,"mac");
            mobile mob1=new mobile(222,"Nokia","Red","250",28,4.0,"regular","Full HD",1,"Android");
            mobile mob2=new mobile(333,"Samsung","Black","new_100",32,6.0,"gorila","HD",3,"Android");
            mob.call();mob.receive_call();mob.hang_up();
            System.out.println(" ");



        }
    }