package net.lamah.billingservice.repository;

import net.lamah.billingservice.entities.Bill;
import net.lamah.billingservice.entities.ProductItem;
import net.lamah.billingservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductItimRepository extends JpaRepository<Product,Long> {
    List<ProductItem> findByBillId(Long billId);
}
