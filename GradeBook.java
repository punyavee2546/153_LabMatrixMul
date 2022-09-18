package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class GradeBook {
    ArrayList<Student> gradebook;

    public GradeBook() {
        gradebook = new ArrayList<>(); 

        Path inFile = Paths.get(".","S21scores.txt");
        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader r = Files.newBufferedReader(inFile, charset)) { 
            String line; 
            while ((line = r.readLine()) != null) {
                String [] tokens = line.split(" ");
                Student s = new Student(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]), tokens[4], tokens[5]);
                s.addScore(tokens[6], Integer.parseInt(tokens[7]));
                s.addScore(tokens[8], Integer.parseInt(tokens[9]));
                s.addScore(tokens[10], Integer.parseInt(tokens[11]));
                gradebook.add(s);                
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void peek() {
        Student s;
        for (int i = 0; i < 5; i++) {
            s = gradebook.get(i);
            System.out.println(s.getNameAndMajor());
        }
    }
    public void printIndividualGrades(String id) {
        for (Student s : gradebook) {
            if (s.getSocialID().equals(id)) {
                System.out.println(s.getNameAndMajor()+" "+s.myScoreDetail()+" "+s.getAccumActualScore());
            }
        }
    }
    public void printGradesByMajor(String maj) {
        for (Student s : gradebook) {
            if (s.getMajor().equals(maj)) {
                System.out.println(s.getNameAndMajor()+" "+s.myScoreDetail()+" "+s.getAccumActualScore());
            }
        }
    }   
}