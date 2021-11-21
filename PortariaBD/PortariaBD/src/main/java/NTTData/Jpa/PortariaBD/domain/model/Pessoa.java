package NTTData.Jpa.PortariaBD.domain.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Pessoa {

    @Id
    private String cpf;

    @Column(nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String cidade;

    @ManyToOne
    private Estado estado;

    @CreationTimestamp
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

}
