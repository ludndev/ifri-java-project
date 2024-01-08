package bj.ifri.project.services;

import bj.ifri.project.entities.BankAccountEntity;
import bj.ifri.project.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {
    private final BankAccountRepository repository;

    @Autowired
    public BankAccountService(BankAccountRepository repository) {
        this.repository = repository;
    }

    public BankAccountEntity create(BankAccountEntity agency) {
        return repository.save(agency);
    }

    public List<BankAccountEntity> read() {
        return repository.findAll();
    }

    public Optional<BankAccountEntity> read(Long id) {
        return repository.findById(id);
    }

    public BankAccountEntity update(BankAccountEntity agency) {
        return repository.save(agency);
    }

    public void delete(BankAccountEntity agency) {
        repository.delete(agency);
    }
}
