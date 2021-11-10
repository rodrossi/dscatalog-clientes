package com.bootcamp.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.desafio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
