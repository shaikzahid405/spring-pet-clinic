package springpetclinic.services;

import com.example.springdev.model.Vet;

import java.util.Set;
public interface VetService {
    Vet findById(Long id);
   Vet save(Vet vet);

    Set<Vet> findAll();

}
