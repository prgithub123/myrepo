package dupa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(PersistenceContext.class);
		CustomerRepository repository = context.getBean(CustomerRepository.class);
		repository.save(new Customer("Rajesh", "Bangalore"));
		repository.save(new Customer("Krishna", "Kannur"));
		System.out.println("CUSTOMER DETAILS");
		Iterable<Customer> customers = repository.findAll();
		for (Object customer : customers) {
			System.out.println(customer);
		}
		((AbstractApplicationContext) context).close();

	}

}
