package co.cesde.edu.scg.App.Services.IMPL;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Repositories.StudentsRepository;
import co.cesde.edu.scg.App.Services.StudentServices;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentServices {

    private final StudentsRepository studentsRepository;

    public StudentServiceIMPL(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public List<Students> FindAll() {
        return studentsRepository.FindAll();
    }

    @Override
    public void save(Students students) {
        studentsRepository.save(students);
    }

    @Override
    public Students FindById(Long id) {
        return studentsRepository.FindById(id);
    }

    @Override
    public void deleteBy(Long id) {
        studentsRepository.deleteBy(id);
    }

    @Override
    public void update(Students student) {
        studentsRepository.update(student);
    }
}