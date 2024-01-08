package bj.ifri.project.repositories;

import bj.ifri.project.entities.InterestAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestAccountRepository extends JpaRepository<InterestAccountEntity, Long> {
    //
}
