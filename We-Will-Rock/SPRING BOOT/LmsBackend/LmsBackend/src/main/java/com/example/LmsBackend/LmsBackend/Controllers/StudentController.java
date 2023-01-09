package com.example.LmsBackend.LmsBackend.Controllers;

import com.example.LmsBackend.LmsBackend.Models.Card;
import com.example.LmsBackend.LmsBackend.Models.Student;
import com.example.LmsBackend.LmsBackend.RequestDtos.StudentRequestDto;
import com.example.LmsBackend.LmsBackend.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody()StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id")Integer id){
        Student student=studentService.getStudentById(id);
        return new ResponseEntity<>(student,HttpStatus.FOUND);
    }

//    @GetMapping("/get-card-details")
//    public ResponseEntity<Card> getCardDetails(){
//        Card card=studentService.getCardDetails();
//        return  new ResponseEntity<>(card,HttpStatus.FOUND);
//    }
}
