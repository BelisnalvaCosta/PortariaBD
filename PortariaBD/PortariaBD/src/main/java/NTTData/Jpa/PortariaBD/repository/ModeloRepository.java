package NTTData.Jpa.PortariaBD.repository;

import NTTData.Jpa.PortariaBD.domain.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

}
