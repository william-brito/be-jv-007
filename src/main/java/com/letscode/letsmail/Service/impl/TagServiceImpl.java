package com.letscode.letsmail.Service.impl;

import com.letscode.letsmail.Service.TagService;
import com.letscode.letsmail.model.Tag;
import com.letscode.letsmail.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Autowired
    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Tag salvar(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Tag buscar(Long id) {
        return tagRepository.getReferenceById(id);
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value = "tags", condition = "#pageable.pageSize>10")
    public List<Tag> listar() {
        return tagRepository.findAll();
    }

    @Override
    public void excluir(Long id) {

    }

}
