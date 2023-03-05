package ma.pfe.student.contrellers;

import ma.pfe.student.dtos.StudentDto;
import ma.pfe.student.repositories.StudentRepositoryImpl;
import ma.pfe.student.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")

public class StudentController {
    private final static Logger LOG =  LoggerFactory.getLogger(StudentController.class);
    private StudentService service;
   public   StudentController(StudentService service){
        this.service=service;
    }
    @PostMapping
    public long create(@RequestBody StudentDto dto){
        return service.create(dto);
    }
    @PutMapping
    public boolean update(@RequestBody StudentDto dto){

       return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@PathVariable("id")long id){
        LOG.debug("start delete");
       return service.delete(id);
    }


    @GetMapping
    public List<StudentDto> readAll(){
        return service.readAll();
    }

}
