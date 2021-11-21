package NTTData.Jpa.PortariaBD.domain.Exception;

public class EntidadeNaoEncontradaExcception extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaExcception(String mensagem) {
        super(mensagem);
    }
}
