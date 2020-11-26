package assignment;
import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Module> cModules=new ArrayList<Module>();
    private List<Student> cStudents=new ArrayList<Student>();
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate=startDate;
        this.endDate=endDate;
    }

	//setters
    public void setName(String name) {
        this.name = name;
    }
    public void setModules(List<Module> modules) {
        this.cModules = modules;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    //getters
    public String getName() {
        return name;
    }
    public List<Module> getModules() {
        return cModules;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public List<Student> getStudents(){
    		return cStudents;
    }
    
    //mutators
    public boolean removeModule(Module module){
        return cModules.remove(module);
    }
    
    // add the modules
    public void addModule(Module module){
        cModules.add(module);
    }
    
    public boolean removeStudent(Student student) {
    		return cStudents.remove(student);
    }
    
    public void addStudent(Student student) {
    	cStudents.add(student);
    }

}