package com.example.mappers;

import org.mapstruct.Mapper;

import com.example.Student;
import com.example.StudentDTO;

@Mapper
public interface StudentMapper {
    public Student studentDTOToStudent(StudentDTO studentDTO);
}
