package NTTData.Jpa.PortariaBD.repository;

import NTTData.Jpa.PortariaBD.domain.model.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
