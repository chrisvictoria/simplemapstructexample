package com.example;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;

import com.example.mappers.StudentMapper;

public class Main {

    public static void main(String args[]) {
        List<CourseDTO> courses = new ArrayList<CourseDTO>();
        CourseDTO course1 =new CourseDTO();
        course1.setName("1");
        CourseDTO course2 = new CourseDTO();
        course2.setName("2");
        courses.add(course1);
        courses.add(course2);
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setGenero("masculino");
        studentDTO.setLastname("apellido");
        studentDTO.setName("nombre");
        studentDTO.setCourses(courses);
        StudentMapper mapper = Mappers.getMapper(StudentMapper.class);
        Student student = mapper.studentDTOToStudent(studentDTO);
        System.out.println(student.name);
        student.courses.forEach(System.out::println);
    }
}
