package bj.ifri.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "bank_account")
public class BankAccountEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String numero;

    @Column
    private float solde;

    @Column
    private Date dateOuverture;

    @Column
    private String nomClient;

    @Column
    private String prenomClient;

    @Column
    private String numeroAgence;

    @Column
    private String numeroBanque;

    @ManyToOne()
    @JoinColumn(name = "agency_id")
    private AgencyEntity agency;

    @ManyToOne()
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
