package co.com.suramericana.micro.service.impl;

import co.com.suramericana.micro.service.ProductoService;
import co.com.suramericana.micro.domain.Producto;
import co.com.suramericana.micro.repository.ProductoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing Producto.
 */
@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {

    private final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    /**
     * Save a producto.
     *
     * @param producto the entity to save
     * @return the persisted entity
     */
    @Override
    public Producto save(Producto producto) {
        log.debug("Request to save Producto : {}", producto);
        System.out.println(producto.getNombre());
        System.out.println(producto.getPrecio());
        System.out.println(producto.getMarca());
        return producto;//productoRepository.save(producto);
    }

    /**
     * Get all the productos.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        log.debug("Request to get all Productos");
        return productoRepository.findAll();
    }

    /**
     * Get one producto by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Producto findOne(Long id) {
        log.debug("Request to get Producto : {}", id);
        return productoRepository.findOne(id);
    }

    /**
     * Delete the producto by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Producto : {}", id);
        productoRepository.delete(id);
    }
}
