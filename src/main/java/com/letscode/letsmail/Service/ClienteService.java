package com.letscode.letsmail.Service;

import com.letscode.letsmail.model.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente salvar(Cliente cliente);

    Cliente buscar(Long id);

    List<Cliente> listar();

    void excluir(Long id);

}
