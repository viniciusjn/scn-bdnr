package com.example.sistemanotas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "alunos")

public class Aluno {

    @Id
    private Integer id;
    private String nome;
    private Integer idade;
    private String curso;
}
