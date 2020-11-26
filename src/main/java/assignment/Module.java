package assignment;

import java.util.ArrayList;
import java.util.List;


public class Module
{
	private String name;
	private int id;
	

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

	public int getID() {
		return this.id;
	}
}
