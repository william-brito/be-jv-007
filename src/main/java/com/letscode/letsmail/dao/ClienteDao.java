package com.letscode.letsmail.dao;

import com.letscode.letsmail.model.Cliente;

import java.util.List;

public class ClienteDao implements BaseDao<Cliente, Long>  {
    @Override
    public Cliente buscar(Long id) {
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public Cliente salvar(Cliente entity) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public Cliente atualizar(Long id, Cliente newEntity) {
        return null;
    }
}
