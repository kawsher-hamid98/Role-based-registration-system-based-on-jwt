package EventManagement.controller;

import EventManagement.model.User;
import EventManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(value = "/rest")
@RestController
public class TestRestAPIs {
    @Autowired private UserRepository userRepository;
	
	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<User> getAll() {
	    return userRepository.findAll();
	}

	@DeleteMapping("/admin/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
	public void deleteUser(@PathVariable("id") String id) {
		userRepository.deleteById(id);
	}

	@GetMapping("/userpage")
    @PreAuthorize(("hasAuthority('USER')"))
    public String get() {
	    return "Hello there user access";
    }
}