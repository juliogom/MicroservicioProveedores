package co.com.suramericana.micro.service;

import co.com.suramericana.micro.domain.Empresa;
import java.util.List;

/**
 * Service Interface for managing Empresa.
 */
public interface EmpresaService {

    /**
     * Save a empresa.
     *
     * @param empresa the entity to save
     * @return the persisted entity
     */
    Empresa save(Empresa empresa);

    /**
     * Get all the empresas.
     *
     * @return the list of entities
     */
    List<Empresa> findAll();

    /**
     * Get the "id" empresa.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Empresa findOne(Long id);

    /**
     * Delete the "id" empresa.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
