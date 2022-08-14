package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.TagService;
import com.letscode.letsmail.model.Tag;
import com.letscode.letsmail.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag salvar(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Tag buscar(Long id) {
        return tagRepository.getReferenceById(id);
    }

    @Override
    public List<Tag> listar() {
        return tagRepository.findAll();
    }

    @Override
    public void excluir(Long id) {

    }

}
