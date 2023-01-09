package com.example.LmsBackend.LmsBackend.Convertors;

import com.example.LmsBackend.LmsBackend.Models.Student;
import com.example.LmsBackend.LmsBackend.RequestDtos.StudentRequestDto;
import jakarta.persistence.Column;


public class StudentConvertor {

    public static Student convertDtoToEntity(StudentRequestDto studentRequestDto){
        Student student= Student.builder().
                        age(studentRequestDto.getAge()).
                        name(studentRequestDto.getName()).
                        country(studentRequestDto.getCountry()).
                        email(studentRequestDto.getEmail()).build();
        return student;

    }

}
