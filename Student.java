package test;

import java.util.ArrayList;

public class Student extends Person
{

    private String major;
    private String socialID;
    private String visa;
    private ArrayList<Grade> myScore = new ArrayList<>();
    
    public Student()
    {
        major = socialID = visa = null;
    }
    
    public Student(String f, String l, String nat, int age, String major, String id)
    {
        super(f, l, nat, age);
        this.major = major;
        socialID = id;
        if (nationality.equals("USA"))
            visa = ""; 
        else
            visa = "F1";
    }
    
    public String getNameAndMajor()
    {
        return firstName + " " + lastName + " " + major;
    }
    
    public String toString()
    {
        return super.toString() + " " + visa + " " + socialID + " " + major;
    }
    
    public static void main(String[] args)
    {
        Student s = new Student("Joe","Roly","complicated",20,"Information Systems", "joly");
        Student s2 = new Student();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s.getNameAndMajor());
        Person p = new Student("Darien","Weems","USA",20,"Information Systems","dweems");
        System.out.println(p);
        System.out.println(((Student)p).getNameAndMajor());
    }

    public void addScore(String t, int s) {
        myScore.add(new Grade(t, s));
    }

    public String myScoreDetail(){
        String[] line = new String[myScore.size()];
        for (int i = 0; i < myScore.size(); i++) {
            line[i] =myScore.get(i).getTaskID()+"("+myScore.get(i).getScore()+")";
        }
        String lineC = String.join(" ", line);
        return lineC;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }
    public String getAccumActualScore() {
        Double acc = 0.0;
        for (int i = 0; i < myScore.size(); i++) {
            acc+=myScore.get(i).getActualScore();
        }
        return "weighted to "+ String.format("%.2f",acc);
    }
}