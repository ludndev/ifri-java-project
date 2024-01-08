package bj.ifri.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "agency")
public class AgencyEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String numero;

    @Column
    private String nom;

    @Column
    private String adresse;

    @Column
    @Transient
    private String ville;

    @Column
    private String codePostal;

    @Column
    private String nomDirecteur;

    @Column
    private String nomBanque;
}
