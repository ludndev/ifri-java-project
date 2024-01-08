package bj.ifri.project.services;

import bj.ifri.project.entities.InterestAccountEntity;
import bj.ifri.project.repositories.InterestAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterestAccountService {
    private final InterestAccountRepository repository;

    @Autowired
    public InterestAccountService(InterestAccountRepository repository) {
        this.repository = repository;
    }

    public InterestAccountEntity create(InterestAccountEntity entity) {
        return repository.save(entity);
    }

    public List<InterestAccountEntity> read() {
        return repository.findAll();
    }

    public Optional<InterestAccountEntity> read(Long id) {
        return repository.findById(id);
    }

    public InterestAccountEntity update(InterestAccountEntity entity) {
        return repository.save(entity);
    }

    public void delete(InterestAccountEntity entity) {
        repository.delete(entity);
    }
}
