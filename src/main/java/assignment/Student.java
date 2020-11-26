package assignment;

import java.util.ArrayList;

public class Student {
    public String name;
    public int DOB;
    public int ID;
    public int age;
    public ArrayList<Course> sCourses;

    public Student(String name, int DOB, int age, int ID){
        this.name=name;
        this.DOB=DOB;
        this.ID=ID;
        this.age=age;
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
        this.sCourses = courses;
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
        return sCourses;
    }

    public int getAge() {
        return age;
    }
    
    public String getUsername() {
		return this.name + getAge();
	}

    //mutators
    public void addCourse(Course course){
        sCourses.add(course);
    }
    public boolean removeCourse(Course course){
        return sCourses.remove(course);
    }

}