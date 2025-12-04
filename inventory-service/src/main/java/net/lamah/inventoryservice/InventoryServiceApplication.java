package net.lamah.inventoryservice;

import net.lamah.inventoryservice.entities.Product;
import net.lamah.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(32000)
                    .quantity(12)
                    .build());
            productRepository.save(Product.builder()
                    .name("Imprimante")
                    .price(22000)
                    .quantity(23)
                    .build());
            productRepository.save(Product.builder()
                    .name("Interphone")
                    .price(4000)
                    .quantity(10)
                    .build());
        };
    }

}
