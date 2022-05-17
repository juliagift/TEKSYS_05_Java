package jpa.entitymodels;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int cId;
	
	@Column(name = "name", unique = false, nullable = false, length = 50)
	private String cName;
	
	@Column(name = "instructor", unique = false, nullable = false, length = 50)
	private String cInstructorName;

	public Course() {
		this.cId = 0;
		this.cName = null;
		this.cInstructorName = null;
	}

	public Course(int cId) {
		this();
		this.cId = cId;
	}

	public Course(int cId, String cName, String cInstructorName) {
		this.cId = cId;
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	@Override
	public String toString() {
		return String.format("%-5d %-30s %-20s", cId, cName, cInstructorName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cId, cInstructorName, cName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cId == other.cId && Objects.equals(cInstructorName, other.cInstructorName)
				&& Objects.equals(cName, other.cName);
	}
}
