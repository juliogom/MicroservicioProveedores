package co.com.suramericana.micro.service;

import co.com.suramericana.micro.domain.Driver;
import java.util.List;

/**
 * Service Interface for managing Driver.
 */
public interface DriverService {

    /**
     * Save a driver.
     *
     * @param driver the entity to save
     * @return the persisted entity
     */
    Driver save(Driver driver);

    /**
     * Get all the drivers.
     *
     * @return the list of entities
     */
    List<Driver> findAll();

    /**
     * Get the "id" driver.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Driver findOne(Long id);

    /**
     * Delete the "id" driver.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
