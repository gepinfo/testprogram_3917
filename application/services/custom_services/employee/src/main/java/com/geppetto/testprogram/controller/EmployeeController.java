package com.geppetto.testprogram.controller;

import com.geppetto.testprogram.dto.EmployeeDto;
import com.geppetto.testprogram.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

   private final EmployeeService employeeService;

   public EmployeeController(EmployeeService employeeService) {
      this.employeeService = employeeService;
   }

    @PostMapping
    public ResponseEntity<EmployeeDto> create(@RequestBody EmployeeDto employeeDto) {
      return ResponseEntity.status(HttpStatus.OK).body(employeeService.create(employeeDto));
    }



    @GetMapping
     public ResponseEntity<List<EmployeeDto>> getAllValues() {
       return ResponseEntity.ok(employeeService.getAllValues());
     }


    @PutMapping
    public ResponseEntity<EmployeeDto> update(@RequestBody EmployeeDto employeeDto) {
       return ResponseEntity.ok(employeeService.update(employeeDto));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable String id) {
       return ResponseEntity.ok(employeeService.delete(id));
    }


    @GetMapping("/search")
    public ResponseEntity<List<EmployeeDto>> search(@RequestParam Map<String, String> allParams) {
       return ResponseEntity.ok(employeeService.search(allParams));
    }
    

}