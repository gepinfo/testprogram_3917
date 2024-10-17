package com.geppetto.testprogram.service;

import com.geppetto.testprogram.dto.EmployeeDto;
import java.util.List;
import java.util.Map;

public interface EmployeeService {

    EmployeeDto create(EmployeeDto employeeDto);



    List<EmployeeDto> getAllValues();


    EmployeeDto update(EmployeeDto employeeDto);


    String delete(String id);


    List<EmployeeDto> search(Map<String, String> allParams);


}
