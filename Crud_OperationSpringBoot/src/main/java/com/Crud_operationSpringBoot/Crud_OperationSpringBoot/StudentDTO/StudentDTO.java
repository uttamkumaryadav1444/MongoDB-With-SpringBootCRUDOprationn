package com.Crud_operationSpringBoot.Crud_OperationSpringBoot.StudentDTO;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class StudentDTO {

    private String id;
    private String studentName;
    private String div;
    private String location;
    private BigDecimal roll;
}
