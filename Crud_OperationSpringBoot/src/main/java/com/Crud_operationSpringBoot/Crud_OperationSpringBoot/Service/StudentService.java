package com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Service;

import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Model.Student;
import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Repositories.StudentRepository;
import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.StudentDTO.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public String createStudent(StudentDTO studentDTO){
        try {
            Student stu = Student.builder()
                    .studentName(studentDTO.getStudentName())
                    .div(studentDTO.getDiv())
                    .roll(studentDTO.getRoll())
                    .location(studentDTO.getLocation())
                    .build();
            studentRepository.save(stu);

        }catch (Exception e){
            //TODO: handle exception
        }
        return "Student created successful";
    }

}
