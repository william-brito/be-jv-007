package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.TagService;
import com.letscode.letsmail.model.Tag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tag")
@io.swagger.v3.oas.annotations.tags.Tag(name = "Tag", description = "Gerenciamento das tags")
public class TagController {

    private final TagService tagService; // Criar service de tag

    @Autowired
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @Operation(description = "Salvar uma tag")
    @PostMapping
    public ResponseEntity<Tag> save(@RequestBody @Valid Tag tag) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tagService.salvar(tag));
    }

    @Operation(description = "Lista todas as tags")
    @GetMapping
    public ResponseEntity<List<Tag>> listar() {
        return ResponseEntity.status(HttpStatus.OK).body(tagService.listar());
    }

}
