package com.letscode.bejv007.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    private String email;

    /*
    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    private String conteudo;

*/
    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;


}
