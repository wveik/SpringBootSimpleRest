package net.proselyte.customerdemo.service.interfaces;

import net.proselyte.customerdemo.model.Customer;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @author Mikhail Kataev
 * @version 1.0
 */

public interface ICustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
