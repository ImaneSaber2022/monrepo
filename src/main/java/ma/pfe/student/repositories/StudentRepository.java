package ma.pfe.student.repositories;

import ma.pfe.student.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {
    long create (StudentEntity e);
    boolean update (StudentEntity e);
    boolean delete(long id);
    List<StudentEntity> readAll();
}
