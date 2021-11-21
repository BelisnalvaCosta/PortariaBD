package NTTData.Jpa.PortariaBD.domain.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
public class Portaria {

    @Id
    @GeneratedValue( = GenerationType.IDENTITY)
    private Long id

    @ManyToOne
    @JoinColumns(name = "pessoa_cpf", nullable = false)
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumns(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @Column(name = "dataHora_entrada")
    private LocalDateTime dataHoraEntrada;

    @Column(name = "dataHora_saida")
    private LocalDateTime dataHoraSaida;

    @CreationTimestamp
    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;

}
