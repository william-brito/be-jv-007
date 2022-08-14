package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.EmailService;
import com.letscode.letsmail.model.Campanha;
import com.letscode.letsmail.model.Cliente;
import com.letscode.letsmail.model.Email;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Operation(description = "Salvar um email na LetsMail")
    @PostMapping
    public ResponseEntity<Email> save(@RequestBody @Valid Email email) {
        return new ResponseEntity<Email>(emailService.salvar(email), HttpStatus.CREATED);
    }

    @Operation(description = "Buscar um email")
    @GetMapping("/{id}")
    public ResponseEntity<Email> show(@RequestParam Long id) {
        return ResponseEntity.ok(emailService.buscar(id));
    }

    @Operation(description = "Listar todos os emails")
    @GetMapping
    public ResponseEntity<List<Email>> index() {
        return ResponseEntity.ok(emailService.listar());
    }
}
