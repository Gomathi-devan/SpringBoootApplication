package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    @Autowired
    private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Gomathi","devan","gomathidevan1830@gmail.com"));
		this.userRepository.save(new User("Naresh","devan","nareshdevan30@gmail.com"));
		this.userRepository.save(new User("Niranj","devan","niranjdevan130@gmail.com"));
		this.userRepository.save(new User("Kavitha","ashok","kaviash183@gmail.com"));
		this.userRepository.save(new User("Sangeetha","krish","sangeethakrish130@gmail.com"));
		this.userRepository.save(new User("Kumutha","krish","kumukrish830@gmail.com"));
		this.userRepository.save(new User("Sidhu","ash","sidhuash0@gmail.com"));
		this.userRepository.save(new User("Yogitha","ashok","yogithaash1830@gmail.com"));
		this.userRepository.save(new User("Jaga","krish","jagas20@gmail.com"));
		
		
	}

}
