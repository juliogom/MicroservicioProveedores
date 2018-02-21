package co.com.suramericana.micro.service.impl;

import co.com.suramericana.micro.service.PersonaService;
import co.com.suramericana.micro.domain.Persona;
import co.com.suramericana.micro.repository.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing Persona.
 */
@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

    private final Logger log = LoggerFactory.getLogger(PersonaServiceImpl.class);

    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    /**
     * Save a persona.
     *
     * @param persona the entity to save
     * @return the persisted entity
     */
    @Override
    public Persona save(Persona persona) {
        log.debug("Request to save Persona : {}", persona);
        return personaRepository.save(persona);
    }

    /**
     * Get all the personas.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        log.debug("Request to get all Personas");
        return personaRepository.findAll();
    }

    /**
     * Get one persona by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Persona findOne(Long id) {
        log.debug("Request to get Persona : {}", id);
        return personaRepository.findOne(id);
    }

    /**
     * Delete the persona by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Persona : {}", id);
        personaRepository.delete(id);
    }
}
