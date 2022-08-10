package com.letscode.bejv007.Service.impl;

import com.letscode.bejv007.Service.ClienteService;
import com.letscode.bejv007.model.Cliente;
import com.letscode.bejv007.repository.ClienteRepository;
import org.springframework.stereotype.Service;

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
}
