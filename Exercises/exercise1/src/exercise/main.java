package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class main {                          //main class for Student and Session
    public static void main(String[] args) throws Exception {
        // create a new Session
        Scanner sc=new Scanner(System.in);
        Session session = new Session();
        Random random=new Random();

        // add 20 dummy students to the session (10 part-time and 10 full-time)
        try{
        for (int i = 1; i <= 10; i++) {                                        //loop to add 10 parttime students

            System.out.println("Enter name of parttime student" + i);
            String n = sc.nextLine();
            PartTimeStudent partTimeStudent = new PartTimeStudent(n ,i);
            double[] quizScores = new double[15];
            for (int j = 0; j < 15; j++) {                                 //loop to generate quizscore using function random()
                double s = 1 + random.nextInt(14);
                quizScores[j] = s;
                partTimeStudent.setQuizScore(j, s);
                }
            session.addStudent(partTimeStudent);

            }}
        catch (IllegalArgumentException e) {
            System.out.println("An error occurred while adding a part-time student: " + e.getMessage());
        }


        try{
        for (int i = 1; i <= 10; i++) {                                       //loop to add 10 fulltime students

            System.out.println("Enter name of fulltime student "+i);
            String m= sc.nextLine();

           FullTimeStudent fullTimeStudent = new FullTimeStudent(m,i);
            //FullTimeStudent fullTimeStudent = new FullTimeStudent("FullTimeStudent" + i,i);
            double[] fullTimeQuizScores = new double[15];
            for (int j = 0; j < 15; j++) {                                 //loop to generate quizscore using function random()
                double ss=1+random.nextInt(14);
                fullTimeQuizScores[j] = ss;
                fullTimeStudent.setQuizScore(j, ss);
            }

            fullTimeStudent.setExam1Score(25+random.nextInt(99));               //add examscore1 for fulltime student using random()
            fullTimeStudent.setExam2Score(25+random.nextInt(99));               //add examscore2 for fulltime student using random()
            session.addStudent(fullTimeStudent);
        }}catch (IllegalArgumentException e) {
            System.out.println("An error occurred while adding a part-time student: " + e.getMessage());
        }

        // call all the public methods of Session and capture their output on the console
        System.out.println(session.calculateAverageQuizScore());
        session.printQuizScoresAscending();
        session.printPartTimeStudents();
        session.printFullTimeExamScores();

    }
}
