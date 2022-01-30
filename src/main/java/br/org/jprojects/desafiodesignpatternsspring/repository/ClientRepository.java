package br.org.jprojects.desafiodesignpatternsspring.repository;

import br.org.jprojects.desafiodesignpatternsspring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
