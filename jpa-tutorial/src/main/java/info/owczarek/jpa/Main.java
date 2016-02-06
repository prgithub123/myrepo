package info.owczarek.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myDatabase");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person = new Person();
		person.setName("majek");
		person.setSurname("srajek");
		person.setSalary(1000);
		
		Person person2 = new Person();
		person2.setName("majek2");
		person2.setSurname("srajek");
		person2.setSalary(2000);
		
		entityManager.getTransaction().begin();
		entityManager.persist(person);
		entityManager.persist(person2);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}

}
