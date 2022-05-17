package jpa.entitymodels;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Course")
public class StudentCourse implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Student_email")
	private String sEmail;
	
	@Id
	@Column(name = "sCourses_id")
	private int cId;

	public StudentCourse() {
		
	}

	public StudentCourse(String sEmail, int cId) {
		this.sEmail = sEmail;
		this.cId = cId;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
}
