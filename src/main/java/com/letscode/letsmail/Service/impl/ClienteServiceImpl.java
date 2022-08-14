package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.ClienteService;
import com.letscode.letsmail.model.Cliente;
import com.letscode.letsmail.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscar(Long id) {
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }

    @Override
    public void excluir(Long id) {

    }
}
