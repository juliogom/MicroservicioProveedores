package co.com.suramericana.micro.service;

import co.com.suramericana.micro.domain.Producto;
import java.util.List;

/**
 * Service Interface for managing Producto.
 */
public interface ProductoService {

    /**
     * Save a producto.
     *
     * @param producto the entity to save
     * @return the persisted entity
     */
    Producto save(Producto producto);

    /**
     * Get all the productos.
     *
     * @return the list of entities
     */
    List<Producto> findAll();

    /**
     * Get the "id" producto.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Producto findOne(Long id);

    /**
     * Delete the "id" producto.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
