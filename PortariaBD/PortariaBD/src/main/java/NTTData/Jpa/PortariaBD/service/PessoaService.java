package NTTData.Jpa.PortariaBD.service;

import NTTData.Jpa.PortariaBD.domain.Exception.EntidadeEmUsoException;
import NTTData.Jpa.PortariaBD.domain.Exception.EntidadeNaoEncontradaExcception;
import NTTData.Jpa.PortariaBD.domain.model.Pessoa;
import NTTData.Jpa.PortariaBD.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void excluir(String pessoaId) {
        try {
            pessoaRepository.deleteById(pessoaId);
        }catch(EmptyResultDataAccessException e) {
            throw new EntidadeNaoEncontradaExcception(
                    String.format("Não existe um cadastro de pessoa com código com %d", pessoaId));

        }catch(DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format("Estado de código %d não pode ser removido, pois está em uso"));
        }
    }
}
