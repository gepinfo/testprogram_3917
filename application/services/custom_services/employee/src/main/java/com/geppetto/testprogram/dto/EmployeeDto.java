package com.geppetto.testprogram.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;






@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String _id;
    
    private String Name;
    
    private Number Age;
    
    }
