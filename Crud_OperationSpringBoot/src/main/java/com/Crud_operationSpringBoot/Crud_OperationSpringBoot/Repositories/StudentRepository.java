package com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Repositories;

import com.Crud_operationSpringBoot.Crud_OperationSpringBoot.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
