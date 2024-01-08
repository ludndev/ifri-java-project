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
@Table(name = "bank")
public class BankEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String numero;

    @Column
    private float capital;

    @Column
    private String adresseSiege;

    @Column
    private String villesAgences;

    @ManyToOne()
    @JoinColumn(name = "agence_id")
    private AgencyEntity agence;
}
