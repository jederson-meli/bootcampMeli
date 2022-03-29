package com.meli.obterdiploma.model;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    @NotBlank(message = "O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do aluno deve começar com letra maiúscula.")
    @Size(max = 50, message = "O comprimento do nome do aluno não pode exceder 50 caracteres")
    private String studentName;

    String message;
    Double averageScore;

    @NotEmpty(message = "A lista de assuntos não pode ficar vazia.")
    private List<@Valid SubjectDTO> subjects;
}
