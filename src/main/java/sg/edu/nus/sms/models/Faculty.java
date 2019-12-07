package sg.edu.nus.sms.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	
	public Faculty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}
	
}
