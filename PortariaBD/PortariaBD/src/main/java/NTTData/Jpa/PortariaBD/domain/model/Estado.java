package NTTData.Jpa.PortariaBD.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String estado;
}
