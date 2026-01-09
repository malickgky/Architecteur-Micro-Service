package net.lamah.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.lamah.billingservice.model.Product;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductItem {
    @Id
    @GeneratedValue
    private Long productId;
    private Long id;
    private int quantity;
    private double price;
    @ManyToOne
    private  Bill bill;
    @Transient
    private Product product;
}
