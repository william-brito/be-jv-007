package com.letscode.letsmail.repository;

import com.letscode.letsmail.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
