package exercise;

public class Student {                            // Base class
    private String name;                          //Variable for 'name' of Student
    private int id;                               //Variable for 'ID' of Student
    private double[] quizScores;

    public Student(String name, int id) {          //Constructor of Student class with parameter
        this.name = name;
        this.id = id;
        this.quizScores = new double[15];
    }

    public String getName() {                      //Getter for Student names also its being inherited for sub classes
        return name;
    }

    public int getId() {                          //Getter for Student ID also its being inherited for sub classes
        return id;
    }

    public double[] getQuizScores() {             //Ge for Student QuizScore also its being inherited for sub classes
        return quizScores;
    }

    public void setQuizScore(int quizNumber, double score) {         //set method to get quiz's 'score' with quizNumber
        quizScores[quizNumber] = score;
    }
}

 class PartTimeStudent extends Student {                            //subclass for Student PartTime
    public PartTimeStudent(String name, int id) {                   //Constructor of PartTimeStudent class with parameter
        super(name, id);
    }
}

 class FullTimeStudent extends Student {                             //subclass for Student FullTime
    private double exam1Score;
    private double exam2Score;

    public FullTimeStudent(String name, int id) {                          //Constructor of fullimeStudent class with parameter
        super(name, id);
    }

    public double getExam1Score() {                                         // get method for Examscore1
        return exam1Score;
    }

    public void setExam1Score(double exam1Score) {                           // set method for Examscore1
        this.exam1Score = exam1Score;
    }

    public double getExam2Score() {                                            // get method for Examscore2
        return exam2Score;
    }

    public void setExam2Score(double exam2Score) {                              // set method for Examscore1
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }
}