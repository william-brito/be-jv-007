package com.letscode.bejv007.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    private String nome;

    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    private String cpf;

    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    @Email(message = "Email em formato inválido")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id", referencedColumnName = "id")
    private Email email;

}
