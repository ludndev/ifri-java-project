package bj.ifri.project.services;

import bj.ifri.project.entities.AgencyEntity;
import bj.ifri.project.repositories.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgencyService {
    private final AgencyRepository repository;

    @Autowired
    public AgencyService(AgencyRepository repository) {
        this.repository = repository;
    }

    public AgencyEntity create(AgencyEntity agency) {
        return repository.save(agency);
    }

    public List<AgencyEntity> read() {
        return repository.findAll();
    }

    public Optional<AgencyEntity> read(Long id) {
        return repository.findById(id);
    }

    public AgencyEntity update(AgencyEntity agency) {
        return repository.save(agency);
    }

    public void delete(AgencyEntity agency) {
        repository.delete(agency);
    }
}
