package org.gfg;

public class Lecture {

    public Lecture(String mentorName,String password){
        this.mentorName=mentorName;
        this.password=password;
    }

    public Lecture(){

    }

    private String classTitle;
    private String mentorName;
    private String status;
    private String classTime;
    String password; // default

    public void setClassTitle(String classTitle){
        this.classTitle=classTitle;
    }
    public String getClassTitle(){
        return this.classTitle;
    }

    public void setMentorName(String mentorName){
        this.mentorName=mentorName;
    }
    public String getMentorName(){
        return this.mentorName;
    }

    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return this.status;
    }

    public void setClassTime(String classTime){
        this.classTime=classTime;
    }
    public String getClassTime(){
        return this.classTime;
    }

    public static int noOfS=50;
    public static String noOfStudents=new String("fifty");
    public static String noOfStudent="fifty";

    private String getData(){
        return "dummy";
    }

    public  String getDataWrapper(){
        return getData();
    }

}
