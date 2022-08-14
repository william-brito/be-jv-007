package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.CampanhaService;
import com.letscode.letsmail.model.Campanha;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

// TODO:
// Implementar as funções save, index e show com as chamadas no service

@RestController
@RequestMapping("/campanha")
public class CampanhaController {

    @Autowired
    private CampanhaService campanhaService; // Criar service de campanha

    @Operation(description = "Salvar uma campanha")
    @PostMapping
    public ResponseEntity<Campanha> save(@RequestBody @Valid Campanha campanha) {
        return new ResponseEntity<Campanha>(campanhaService.salvar(campanha), HttpStatus.CREATED);
    }

}
