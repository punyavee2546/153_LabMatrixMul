package test;
public class Grade {

    private String taskID;
    private int score;
    private double actualScore=0;
    
    public Grade (String taskID, int score){
        this.taskID=taskID;
        this.score=score;
    }
    
    
    public String getTaskID() {
        return taskID;
    }
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public double getActualScore() {
        if (taskID.contains("Q")) {
            actualScore+=score*0.11;
            return actualScore;
        } else {
            actualScore+=score*0.07;
            return actualScore;
        }
    }
    public void setActualScore(int actualScore) {
        this.actualScore = actualScore;
    }
    

    
}