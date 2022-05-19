package customer.store.customerbootservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	/*@RequestMapping(value = "/GetCustomerById", method = RequestMethod.POST)
	public Optional<Customer> GetCustomerById(@RequestParam("id") Integer id) {
		return customerRepository.findById(id);
	}*/
	
	@RequestMapping(value = "/GetCustomerByName", method = RequestMethod.POST)
	public List<Customer> GetCustomerByName(@RequestParam("Name") String Name) {	
		return customerRepository.findByname(Name);
	}
	
	@RequestMapping(value = "/GetCustomerBydateOfBirth", method = RequestMethod.POST)
	public List<Customer> GetCustomerBydateOfBirth(@RequestParam("dateOfBirth") String dateOfBirth) {	
		return customerRepository.findBydateOfBirth(dateOfBirth);
	}
	
	@RequestMapping(value = "/GetCustomerByphoneNumber", method = RequestMethod.POST)
	public List<Customer> GetCustomerByphoneNumber(@RequestParam("phoneNumber") String phoneNumber) {	
		return customerRepository.findByphoneNumber(phoneNumber);
	}
	
	@RequestMapping(value = "/AddCustomer", method = RequestMethod.POST)
	public Customer GetCustomerByName(
			@RequestParam("name") String name, 
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("dateOfBirth") String dateOfBirth) {
		
		Customer customer = new Customer(name,phoneNumber,dateOfBirth);
		
		return customerRepository.save(customer);
	}
	
	@RequestMapping(value = "/GetAllCustomers", method = RequestMethod.GET)
	public List<Customer> GetAllCustomers() {	
		return customerRepository.findAll();
	}
	
}
