package com.freefinder.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freefinder.api.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
