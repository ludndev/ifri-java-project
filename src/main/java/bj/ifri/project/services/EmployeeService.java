package bj.ifri.project.services;

import bj.ifri.project.entities.EmployeeEntity;
import bj.ifri.project.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmployeeEntity create(EmployeeEntity entity) {
        return repository.save(entity);
    }

    public List<EmployeeEntity> read() {
        return repository.findAll();
    }

    public Optional<EmployeeEntity> read(Long id) {
        return repository.findById(id);
    }

    public EmployeeEntity update(EmployeeEntity entity) {
        return repository.save(entity);
    }

    public void delete(EmployeeEntity entity) {
        repository.delete(entity);
    }
}
