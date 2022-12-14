package com.letscode.letsmail.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
public class EmailTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //0 ou muitos
    @ManyToOne
    private Email email;

    //1 ou muitos
    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    @ManyToOne
    private Tag tag;


}
