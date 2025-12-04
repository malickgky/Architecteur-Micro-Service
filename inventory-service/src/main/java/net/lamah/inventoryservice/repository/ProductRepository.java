package net.lamah.inventoryservice.repository;

import net.lamah.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long>
{
}
