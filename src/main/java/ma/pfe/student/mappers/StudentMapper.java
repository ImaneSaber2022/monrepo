package ma.pfe.student.mappers;

import ma.pfe.student.dtos.StudentDto;
import ma.pfe.student.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    StudentDto convertdto(StudentDto entity){
        StudentDto dto = new StudentDto();
        entity.setId(entity.getId());
        entity.setName(entity.getName());
        return dto;
    }
    StudentEntity convertEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;

    }
   List<StudentEntity> convertlistEntity(List<StudentDto> dtos){
        return dtos.stream().map(dto -> convertEntity(dto)).collect(Collectors.toList());
      /*  return dtos.stream().map(dtos-> convertEntity(dtos)).collect(Collectors.toList());*/
   }
    List<StudentDto>convertlistdto(List<StudentDto>Entity){
        return Entity;
    }
}
