package ma.pfe.student.service;

import ma.pfe.student.dtos.StudentDto;
import ma.pfe.student.repositories.StudentRepositoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG = LoggerFactory.getLogger(StudentService.class);
    private StudentService service;
    @Override
    public long create(StudentDto dto) {

        LOG.debug("start methode create");
        long reslt = service.create(dto);
        return reslt;
    }

    @Override
    public boolean update(StudentDto dto) {

        LOG.debug("start methode update");
       boolean res = service.update(dto);
        return res;
    }

    @Override
    public boolean delete(long id) {

        LOG.debug("start methode delete");
        return service.delete(id);
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start methode list");
        return null;
    }
}
