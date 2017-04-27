package firsthibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bike {
	@Id @GeneratedValue
	@Column (name="BIKE_ID")
	int bikeId;
	@Column(name="BIKE_TYPE")
	String bikeType;
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeType() {
		return bikeType;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	

}
