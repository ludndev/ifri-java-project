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
@Table(name = "interest_account")
public class InterestAccountEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private float taux;
}
