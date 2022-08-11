package com.letscode.letsmail.repository;

import com.letscode.letsmail.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
