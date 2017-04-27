package firsthibernate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="student")
public class Student {
	
	@Id
	@GeneratedValue
	@Column (name="STUDENT_ID")
	int studentId;
	@Column (name= "STUDENT_NAME")
	String studentName;
	@Embedded
	Address address;
	@Transient
	int stuffIDontWant;
	@OneToMany (mappedBy="student")
	Collection<Bike> listOfBikes = new ArrayList<Bike>();
	public Collection<Bike> getListOfBikes() {
		return listOfBikes;
	}
	public void setListOfBikes(Set<Bike> listOfBikes) {
		this.listOfBikes = listOfBikes;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address addr) {
		this.address = addr;
	}
	void setStudentId(int id) { studentId=id;}
	void setStudentName(String name) {studentName = name;}
	int getStudentId() { return studentId; }
	String getStudentName() { return studentName; }
}
