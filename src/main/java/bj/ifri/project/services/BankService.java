package bj.ifri.project.services;

import bj.ifri.project.entities.BankEntity;
import bj.ifri.project.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {
    private final BankRepository repository;

    @Autowired
    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    public BankEntity create(BankEntity entity) {
        return repository.save(entity);
    }

    public List<BankEntity> read() {
        return repository.findAll();
    }

    public Optional<BankEntity> read(Long id) {
        return repository.findById(id);
    }

    public BankEntity update(BankEntity entity) {
        return repository.save(entity);
    }

    public void delete(BankEntity entity) {
        repository.delete(entity);
    }
}
