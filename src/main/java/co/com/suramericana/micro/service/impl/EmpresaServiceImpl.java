package co.com.suramericana.micro.service.impl;

import co.com.suramericana.micro.service.EmpresaService;
import co.com.suramericana.micro.domain.Empresa;
import co.com.suramericana.micro.repository.EmpresaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Implementation for managing Empresa.
 */
@Service
@Transactional
public class EmpresaServiceImpl implements EmpresaService {

    private final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);

    private final EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    /**
     * Save a empresa.
     *
     * @param empresa the entity to save
     * @return the persisted entity
     */
    @Override
    public Empresa save(Empresa empresa) {
        log.debug("Request to save Empresa : {}", empresa);
        return empresaRepository.save(empresa);
    }

    /**
     * Get all the empresas.
     *
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAll() {
        log.debug("Request to get all Empresas");
        return empresaRepository.findAllWithEagerRelationships();
    }

    /**
     * Get one empresa by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public Empresa findOne(Long id) {
        log.debug("Request to get Empresa : {}", id);
        return empresaRepository.findOneWithEagerRelationships(id);
    }

    /**
     * Delete the empresa by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Empresa : {}", id);
        empresaRepository.delete(id);
    }
}
