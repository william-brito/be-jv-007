package com.letscode.letsmail.repository;

import com.letscode.letsmail.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
