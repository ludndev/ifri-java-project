package bj.ifri.project.repositories;

import bj.ifri.project.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    List<ClientEntity> findByNom(String nom);

    List<ClientEntity> findByNomAndPrenom(String nom, String prenom);

    @Query("SELECT c FROM ClientEntity c JOIN BankAccountEntity a ON c.id = a.client.id WHERE a.solde < 0 AND a.numero = :bankNumber")
    List<ClientEntity> findOverdraftClientsByBankNumber(@Param("bankNumber") String bankNumber);
}
