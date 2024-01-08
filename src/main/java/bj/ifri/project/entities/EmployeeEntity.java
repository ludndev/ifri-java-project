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
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String adresse;

    @Column
    private float salaire;

    @Column
    private int numINSEE;

    @Column
    private String nomBanque;

    @ManyToOne()
    @JoinColumn(name = "agency_id")
    private AgencyEntity agency;
}
