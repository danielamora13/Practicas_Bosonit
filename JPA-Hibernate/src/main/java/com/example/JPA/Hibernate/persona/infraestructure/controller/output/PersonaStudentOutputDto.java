package com.example.JPA.Hibernate.persona.infraestructure.controller.output;

import com.example.JPA.Hibernate.student.infraestructure.controller.output.SimpleStudentOutputDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaStudentOutputDto extends PersonaOutputDto {
    SimpleStudentOutputDto simpleStudentOutputDto;
}
