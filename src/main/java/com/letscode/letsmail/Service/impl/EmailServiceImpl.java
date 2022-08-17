package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.EmailService;
import com.letscode.letsmail.model.Email;
import com.letscode.letsmail.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {

    private final EmailRepository emailRepository;

    @Autowired
    public EmailServiceImpl(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    @Override
    public Email salvar(Email email) {
        return emailRepository.save(email);
    }

    @Override
    public Email buscar(Long id) {
        return emailRepository.getReferenceById(id);
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "emails", condition = "#pageable.pageSize>10")
    public List<Email> listar() {
        return emailRepository.findAll();
    }

    @Override
    public void excluir(Long id) {

    }
}
