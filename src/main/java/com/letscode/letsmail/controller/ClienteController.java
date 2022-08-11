package com.letscode.letsmail.controller;

//import com.letscode.bejv007.repository.ClienteRepository;
import io.swagger.v3.oas.annotations.Operation;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letscode.letsmail.Service.ClienteService;
import com.letscode.letsmail.model.Cliente;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(description = "Salvar um cliente na LetsMail")
    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.ok(clienteService.salvar(cliente));
    }
}
