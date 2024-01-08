package bj.ifri.project.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "client")
public class ClientEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String numero;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String adresse;

    @Column
    private String ville;

    @Column
    private String nomConseiller;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private EmployeeEntity employee;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();
}
