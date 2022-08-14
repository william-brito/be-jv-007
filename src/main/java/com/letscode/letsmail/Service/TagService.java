package com.letscode.letsmail.Service;

import com.letscode.letsmail.model.Cliente;
import com.letscode.letsmail.model.Tag;

import java.util.List;

public interface TagService {
    Tag salvar(Tag tag);

    Tag buscar(Long id);

    List<Tag> listar();

    void excluir(Long id);
}
