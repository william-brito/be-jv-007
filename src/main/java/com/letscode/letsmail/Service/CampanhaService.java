package com.letscode.letsmail.Service;

import com.letscode.letsmail.model.Campanha;
import com.letscode.letsmail.model.Tag;

import java.util.List;

public interface CampanhaService {

    Campanha salvar(Campanha campanha);

    Campanha buscar(Long id);

    List<Campanha> listar();

    void excluir(Long id);
}
