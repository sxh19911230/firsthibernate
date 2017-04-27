package firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentName("Forrest Sun");
		Student student2 = new Student();
		student.setStudentName("Forrest Moon");
		Student student3 = new Student();
		student.setStudentName("Forrest Star");
		Address addr = new Address();
		addr.setCity("El Cerrito");
		addr.setStreet("1753 Walnut St.");
		addr.setZip("94530");
		student.setAddress(addr);
		Bike b1 = new Bike();
		b1.setBikeType("fuckyou");
		b1.setStudent(student2);
		Bike b2 = new Bike();
		b2.setStudent(student3);
		b2.setBikeType("fuckyoutwo");
		student.getListOfBikes().add(b1);
		student.getListOfBikes().add(b2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(student);
		session.save(student2);
		session.save(student3);
		session.save(b2);
		session.save(b1);
		session.getTransaction().commit();
		
		//Hi
	}

}
