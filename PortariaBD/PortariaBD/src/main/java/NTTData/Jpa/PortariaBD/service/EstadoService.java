package NTTData.Jpa.PortariaBD.service;

import NTTData.Jpa.PortariaBD.domain.Exception.EntidadeEmUsoException;
import NTTData.Jpa.PortariaBD.domain.model.Estado;
import NTTData.Jpa.PortariaBD.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado salvar(Estado estado) {
        return estadoRepository.save(estado);
    }

    public void excluir(long estadoId) {
        try {
            estadoRepository.deleteById(estadoId);
        }catch(DataIntregrityViolationException e) {
            throw new EntidadeNãoEncontradaException(
                String.format("Não existe um cadastro de estado com código %d", estadoId));

        }catch(DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                String.format("Estado de código %d não pode ser removido, pois está em uso", estadoId));

        }

    }
}
