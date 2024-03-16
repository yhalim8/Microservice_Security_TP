package org.halim.customerservice.repository;

import org.halim.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

/**
 * @author younessHalim
 **/
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
