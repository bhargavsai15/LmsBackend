package com.example.LmsBackend.LmsBackend.RequestDtos;

import lombok.Data;


@Data
public class StudentRequestDto {
    private int age;

    private String name;

    private String email;

    private String country;
}
