package NTTData.Jpa.PortariaBD.domain.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumns(name = "modelo_id", nullable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumns(name = "marca_id", nullable = false)
    private Marca marca;
}
