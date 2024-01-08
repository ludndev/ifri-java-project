package bj.ifri.project.services;

import bj.ifri.project.entities.ClientEntity;
import bj.ifri.project.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public ClientEntity create(ClientEntity entity) {
        return repository.save(entity);
    }

    public List<ClientEntity> read() {
        return repository.findAll();
    }

    public Optional<ClientEntity> read(Long id) {
        return repository.findById(id);
    }

    public ClientEntity update(ClientEntity entity) {
        return repository.save(entity);
    }

    public void delete(ClientEntity entity) {
        repository.delete(entity);
    }

    public List<ClientEntity> searchClientsByName(String nom, String prenom) {
        if (prenom != null && !prenom.isEmpty()) {
            return repository.findByNomAndPrenom(nom, prenom);
        } else {
            return repository.findByNom(nom);
        }
    }

    public List<ClientEntity> getOverdraftClientsOfBank(String bankNumber) {
        return repository.findOverdraftClientsByBankNumber(bankNumber);
    }
}
