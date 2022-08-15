package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.CampanhaService;
import com.letscode.letsmail.model.Campanha;
import com.letscode.letsmail.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampanhaServiceImpl implements CampanhaService {

    private final CampanhaRepository campanhaRepository;

    @Autowired
    public CampanhaServiceImpl(CampanhaRepository campanhaRepository) {
        this.campanhaRepository = campanhaRepository;
    }

    @Override
    public Campanha salvar(Campanha campanha) {
        return campanhaRepository.save(campanha);
    }

    @Override
    public Campanha buscar(Long id) {
        return campanhaRepository.getReferenceById(id);
    }

    @Override
    public List<Campanha> listar() {
        return campanhaRepository.findAll();
    }

    @Override
    public void excluir(Long id) {

    }
}
