package co.cesde.edu.scg.App.Services;

import co.cesde.edu.scg.App.Models.Students;

import java.util.List;

public interface StudentServices {
    List<Students> FindAll();
    void save(Students student);
    Students FindById(Long id);
    void deleteBy(Long id);
    void update(Students student);
}
