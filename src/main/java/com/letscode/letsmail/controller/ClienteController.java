package com.letscode.letsmail.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.letscode.letsmail.Service.ClienteService;
import com.letscode.letsmail.model.Cliente;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@Tag(name = "Cliente", description = "Gerenciamento dos clientes")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(description = "Salvar um cliente na LetsMail")
    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvar(cliente));
    }

    @Operation(description = "Buscar um cliente")
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> show(@RequestParam Long id) {
        return ResponseEntity.ok(clienteService.buscar(id));
    }

    @Operation(description = "Listar todos os clientes")
    @GetMapping
    public ResponseEntity<List<Cliente>> index() {
        return ResponseEntity.ok(clienteService.listar());
    }

    @Operation(description = "Excluir um cliente")
    @DeleteMapping("/{id}")
    public ResponseEntity.HeadersBuilder<?> delete(@RequestParam Long id) {
        clienteService.excluir(id);

        return ResponseEntity.noContent();
    }
}
