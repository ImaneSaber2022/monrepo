package ma.pfe.student.service;

import ma.pfe.student.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    long create(StudentDto dto);
    boolean update(StudentDto dto);
    boolean delete(long id);
    List<StudentDto> readAll();
}
