package net.lamah.customerservice;

import net.lamah.customerservice.entities.Customer;
import net.lamah.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Lamah").email("lamah@gmail.com").build() );
            customerRepository.save(Customer.builder()
                    .name("Augustin").email("augustin@gmail.com").build() );
            customerRepository.save(Customer.builder()
                    .name("Nanfada").email("nanfada@gmail.com").build() );

        };
    }

}
