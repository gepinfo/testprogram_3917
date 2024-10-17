package com.geppetto.testprogram.repository;

import com.geppetto.testprogram.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>  {

}
