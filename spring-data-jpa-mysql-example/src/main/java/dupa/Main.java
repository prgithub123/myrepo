package dupa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		
		repository.save(new Customer("Adam", "Kowalski"));
		repository.save(new Customer("Majek", "Srajek"));
		Iterable<Customer> customers;
		
		System.out.println("findAll: ");
		customers = repository.findAll();
		for (Object customer : customers) {
			System.out.println(customer);
		}
		
		System.out.println("findByName:");
		customers = repository.findByName("Majek");
		for (Object customer : customers) {
			System.out.println(customer);
		}
		
		((AbstractApplicationContext) context).close();

	}

}
