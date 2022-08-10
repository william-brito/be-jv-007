package com.letscode.bejv007.repository;

import com.letscode.bejv007.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
