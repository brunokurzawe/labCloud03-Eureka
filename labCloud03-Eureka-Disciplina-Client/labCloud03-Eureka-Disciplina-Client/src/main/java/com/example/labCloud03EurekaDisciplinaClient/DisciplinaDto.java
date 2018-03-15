package com.example.labCloud03EurekaDisciplinaClient;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DisciplinaDto {

    String nome;
    Integer cargaHoraria;
    Date dataInicio;
    List<String> alunosMatriculados;

}
