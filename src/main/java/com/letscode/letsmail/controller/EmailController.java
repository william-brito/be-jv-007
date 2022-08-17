package com.letscode.letsmail.controller;

import com.letscode.letsmail.Service.EmailService;
import com.letscode.letsmail.model.Email;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/email")
@Tag(name = "Email", description = "Endpoints para utilização dos e-mails gerenciados")
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @Operation(description = "Salvar um email na LetsMail")
    @PostMapping
    public ResponseEntity<Email> save(@RequestBody @Valid Email email) {
        return ResponseEntity.status(HttpStatus.CREATED).body(emailService.salvar(email));
    }

    @Operation(description = "Buscar um email")
    @GetMapping("/{id}")
    public ResponseEntity<Email> show(@RequestParam Long id) {
        return ResponseEntity.ok(emailService.buscar(id));
    }

    @Operation(description = "Lista todos os emails")
    @GetMapping
    public ResponseEntity<List<Email>> listar() {
        return ResponseEntity.ok(emailService.listar());
    }
}
