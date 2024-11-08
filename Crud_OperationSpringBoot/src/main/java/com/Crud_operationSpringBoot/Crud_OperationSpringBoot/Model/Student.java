package com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Model;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document(value = "Student")
@Data
@Builder
public class Student {
    @Id
    private String id;
    @Field(name = "student_name")
    private String studentName;
    private String div;
    private String location;
    private BigDecimal roll;
}
