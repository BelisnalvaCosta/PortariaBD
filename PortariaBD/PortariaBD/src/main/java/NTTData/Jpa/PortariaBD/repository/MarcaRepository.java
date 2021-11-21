package NTTData.Jpa.PortariaBD.repository;

import NTTData.Jpa.PortariaBD.domain.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
