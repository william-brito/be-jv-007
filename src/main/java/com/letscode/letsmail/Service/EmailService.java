package com.letscode.letsmail.Service;

import com.letscode.letsmail.model.Email;

import java.util.List;

public interface EmailService {

    Email salvar(Email email);

    Email buscar(Long id);

    List<Email> listar();

    void excluir(Long id);
}
