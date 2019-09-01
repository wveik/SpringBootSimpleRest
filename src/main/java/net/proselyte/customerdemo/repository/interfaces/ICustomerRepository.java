package net.proselyte.customerdemo.repository.interfaces;

import net.proselyte.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @author Mikhail Kataev
 * @version 1.0
 */
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
