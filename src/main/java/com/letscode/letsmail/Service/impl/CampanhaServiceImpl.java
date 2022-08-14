package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.CampanhaService;
import com.letscode.letsmail.model.Campanha;
import com.letscode.letsmail.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CampanhaServiceImpl implements CampanhaService {

    @Autowired
    private  CampanhaRepository campanhaRepository;

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
