package customer.store.customerbootservice;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findById(Integer id);
	
	List<Customer> findByname(String name);
	
	List<Customer> findBydateOfBirth(String dateOfBirth);
	
	List<Customer> findByphoneNumber(String name);
	
}
