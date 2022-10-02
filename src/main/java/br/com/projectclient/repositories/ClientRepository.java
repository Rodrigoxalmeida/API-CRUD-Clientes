package br.com.projectclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projectclient.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
