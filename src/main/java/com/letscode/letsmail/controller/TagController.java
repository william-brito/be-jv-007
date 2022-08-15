package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.TagService;
import com.letscode.letsmail.model.Cliente;
import com.letscode.letsmail.model.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/tag")
public class TagController {

    private final TagService tagService; // Criar service de tag

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @Operation(description = "Salvar uma tag")
    @PostMapping
    public ResponseEntity<Tag> save(@RequestBody @Valid Tag tag) {
        return new ResponseEntity<Tag>(tagService.salvar(tag), HttpStatus.CREATED);
    }

}
