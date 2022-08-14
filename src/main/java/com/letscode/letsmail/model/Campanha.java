package com.letscode.letsmail.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Campanha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Não pode ser NULL")
    @NotBlank(message = "Não pode ser VAZIO")
    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Tag> tags = new ArrayList<>();
}
