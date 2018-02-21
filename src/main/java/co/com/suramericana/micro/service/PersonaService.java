package co.com.suramericana.micro.service;

import co.com.suramericana.micro.domain.Persona;
import java.util.List;

/**
 * Service Interface for managing Persona.
 */
public interface PersonaService {

    /**
     * Save a persona.
     *
     * @param persona the entity to save
     * @return the persisted entity
     */
    Persona save(Persona persona);

    /**
     * Get all the personas.
     *
     * @return the list of entities
     */
    List<Persona> findAll();

    /**
     * Get the "id" persona.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Persona findOne(Long id);

    /**
     * Delete the "id" persona.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
