package assignment;

import java.util.ArrayList;
import java.util.List;


public class Module
{
	private String name;
	private int id;
	private List<Student> mStudents;
	private List<Course> mCourses;
	

	public Module(String module_name, int id) {
		this.name = module_name;
		this.id = id;
	}

	//Getters and Setters
	public String getName() {
		return this.name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudents(List<Student> students) {
		this.mStudents = students;
	}

	public void setCourses(List<Course> courses) {
		this.mCourses = courses;
	}

	public int getID() {
		return this.id;
	}

	public List<Student> getStudents() {
		return this.mStudents;
	}
	
	
	public List<Course> getCourses() {
		return this.mCourses;
	}
	
	//Mutators
	public void addStudents(ArrayList<Student> students) {
		this.mStudents.addAll(students);
	}

	public void addCourses(ArrayList<Course> courses) {
		this.mCourses.addAll(courses);
	}

}
