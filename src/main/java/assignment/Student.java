package assignment;

import java.util.ArrayList;

public class Student {
    private String name;
    private int DOB;
    private int ID;
    private int age;
    private ArrayList<Course> courses;

    public Student(String name, int DOB, int age, int ID){
        this.name=name;
        this.DOB=DOB;
        this.ID=ID;
        this.age=age;
        this.courses = courses;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDOB(int DOB) {
        this.DOB = DOB;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getDOB() {
        return DOB;
    }
    public int getID(){
        return ID;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int getAge() {
        return age;
    }
    
    public String getUsername() {
		return this.name + getAge();
	}

    //mutators
    public void addCourse(Course course){
        courses.add(course);
    }
    public boolean removeCourse(Course course){
        return courses.remove(course);
    }

}