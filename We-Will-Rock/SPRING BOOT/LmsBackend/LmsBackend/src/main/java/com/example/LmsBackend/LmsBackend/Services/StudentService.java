package com.example.LmsBackend.LmsBackend.Services;

import com.example.LmsBackend.LmsBackend.Convertors.StudentConvertor;
import com.example.LmsBackend.LmsBackend.Enums.CardStatus;
import com.example.LmsBackend.LmsBackend.Models.Card;
import com.example.LmsBackend.LmsBackend.Models.Student;
import com.example.LmsBackend.LmsBackend.Repositories.StudentRepository;
import com.example.LmsBackend.LmsBackend.RequestDtos.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public void addStudent(StudentRequestDto studentRequestDto){
        Student student= StudentConvertor.convertDtoToEntity(studentRequestDto);
        Card newCard=new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        student.setCard(newCard);
        studentRepository.save(student);
    }

    public Student getStudentById(Integer id){
        return studentRepository.findById(id).get();
    }

}
