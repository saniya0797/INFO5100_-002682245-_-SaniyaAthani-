package exercise;

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Session {                            //Class Session
    private List<Student> students;               //List of type Student

    public Session() {                             //Constructor of session without parameter
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {          //method to add student into the list
        students.add(student);
    }

    public double calculateAverageQuizScore() {               //method to calculate average of quizscore/student
        int sum=0;
        for (Student student : students) {
            double[] quizScores = student.getQuizScores();
            int k=quizScores.length;
            for(int i=0;i<k;i++){
                //System.out.println(quizScores[i]);
                sum+=quizScores[i];
            }
            System.out.println("Average quiz of student  "+ student.getName() +"  " +sum/k);
        }
        return 0;
    }


    public void printQuizScoresAscending() {                       //method to print the list of quiz scores in ascending order for one session
        System.out.println("List of quiz scores in ascending order:");
        for (Student student : students) {
            double[] quizScores = student.getQuizScores();
            Arrays.sort(quizScores);
            System.out.println(student.getName() + ": " + Arrays.toString(quizScores));
        }
    }

    public void printPartTimeStudents() {                    //This method print Name of all PartTimestudent
        System.out.println("Part-time students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeExamScores() {                      //method to print exam scores of full-time students
        System.out.println("Full-time exam scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.getName() + ": " +
                        fullTimeStudent.getExam1Score() + " " +
                        fullTimeStudent.getExam2Score());
            }
        }
    }




}






