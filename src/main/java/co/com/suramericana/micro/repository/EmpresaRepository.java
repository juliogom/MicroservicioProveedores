package co.com.suramericana.micro.repository;

import co.com.suramericana.micro.domain.Empresa;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the Empresa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    @Query("select distinct empresa from Empresa empresa left join fetch empresa.productos")
    List<Empresa> findAllWithEagerRelationships();

    @Query("select empresa from Empresa empresa left join fetch empresa.productos where empresa.id =:id")
    Empresa findOneWithEagerRelationships(@Param("id") Long id);

}
