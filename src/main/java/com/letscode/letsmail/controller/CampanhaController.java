package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.CampanhaService;
import com.letscode.letsmail.model.Campanha;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/campanha")
@Tag(name = "Campanha", description = "Funcionalidades para construção e disparo de campanhas")
public class CampanhaController {

    private final CampanhaService campanhaService; // Criar service de campanha

    @Autowired
    public CampanhaController(CampanhaService campanhaService) {
        this.campanhaService = campanhaService;
    }

    @Operation(description = "Salvar uma campanha")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Campanha salva com sucesso", content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Campanha.class)), @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = Campanha.class))}),
            @ApiResponse(responseCode = "422", description = "Campanha inválida", content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = IllegalArgumentException.class))})
    })
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Campanha> save(@RequestBody @Valid Campanha campanha) {
        return ResponseEntity.status(HttpStatus.CREATED).body(campanhaService.salvar(campanha));
    }

}
