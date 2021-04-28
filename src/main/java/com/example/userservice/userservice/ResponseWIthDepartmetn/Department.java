package com.example.userservice.userservice.ResponseWIthDepartmetn;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {


    @Id
    @GeneratedValue
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
