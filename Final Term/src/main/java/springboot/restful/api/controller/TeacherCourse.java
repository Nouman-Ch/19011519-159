package springboot.restful.api.controller;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import springboot.restful.api.Person.Person;

@Entity
@Table (name = "Teacher_Course")
public class TeacherCourse extends Person{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column
	private int TEACHER_ID;
	
	@Column
	private String TEACHER_STATUS;
	
	@Column
	private String COURSE_NAME;
	
	@Column
	private String COURSE_DESC;

	public int getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(int tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}

	public String getTEACHER_STATUS() {
		return TEACHER_STATUS;
	}

	public void setTEACHER_STATUS(String tEACHER_STATUS) {
		TEACHER_STATUS = tEACHER_STATUS;
	}

	public String getCOURSE_NAME() {
		return COURSE_NAME;
	}

	public void setCOURSE_NAME(String cOURSE_NAME) {
		COURSE_NAME = cOURSE_NAME;
	}

	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}

	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + TEACHER_ID + ", teacher_status=" + TEACHER_STATUS + ", course_name=" + COURSE_NAME ", course_description=" + COURSE_DESC + "]";
	}
	
	

}
