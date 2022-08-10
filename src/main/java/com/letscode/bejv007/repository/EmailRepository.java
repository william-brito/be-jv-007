package com.letscode.bejv007.repository;

import com.letscode.bejv007.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
