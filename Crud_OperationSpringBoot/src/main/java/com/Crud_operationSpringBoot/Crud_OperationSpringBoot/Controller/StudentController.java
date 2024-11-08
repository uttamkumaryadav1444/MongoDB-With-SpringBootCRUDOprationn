package com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Controller;

import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Service.StudentService;
import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.StudentDTO.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stu")
public class StudentController {
    @Autowired

    private StudentService studentService;
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createStudent(@RequestBody StudentDTO stu){
        return studentService.createStudent(stu);
    }
}
