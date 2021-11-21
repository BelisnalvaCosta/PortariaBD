package NTTData.Jpa.PortariaBD.repository;

import NTTData.Jpa.PortariaBD.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, String> {

}
