package co.com.suramericana.micro.service.impl;

import co.com.suramericana.micro.service.DriverService;
import co.com.suramericana.micro.domain.Driver;
import co.com.suramericana.micro.repository.DriverRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing Driver.
 */
@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    private final Logger log = LoggerFactory.getLogger(DriverServiceImpl.class);

    private final DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    /**
     * Save a driver.
     *
     * @param driver the entity to save
     * @return the persisted entity
     */
    @Override
    public Driver save(Driver driver) {
        log.debug("Request to save Driver : {}", driver);
        return driverRepository.save(driver);
    }

    /**
     * Get all the drivers.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Driver> findAll() {
        log.debug("Request to get all Drivers");
        return driverRepository.findAll();
    }

    /**
     * Get one driver by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Driver findOne(Long id) {
        log.debug("Request to get Driver : {}", id);
        return driverRepository.findOne(id);
    }

    /**
     * Delete the driver by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Driver : {}", id);
        driverRepository.delete(id);
    }
}
