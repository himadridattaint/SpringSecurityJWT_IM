package com.example.JWT.SpringJWT.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    private Integer studentRoll;
    private String studentName;
    private String studentEmail;
}
