package ma.pfe.student.repositories;

import ma.pfe.student.entities.StudentEntity;
import ma.pfe.student.service.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOG =  LoggerFactory.getLogger(StudentRepositoryImpl.class);
    private  StudentRepository repository;
    @Override
    public long create(StudentEntity e) {

        LOG.debug("start methode create");
        Long result = repository.create(e);
        return result;
    }

    @Override
    public boolean update(StudentEntity e) {
        LOG.debug("start methode update");
        boolean result = repository.update(e);
        return result;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start methode delete");
         return repository.delete(id);

    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start methode update");
        LOG.debug("start methode delete");
        return null;
    }
}
