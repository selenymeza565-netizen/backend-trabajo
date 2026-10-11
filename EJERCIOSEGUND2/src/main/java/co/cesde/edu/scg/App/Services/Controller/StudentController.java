package co.cesde.edu.scg.App.Services.Controller;

import co.cesde.edu.scg.App.Models.Students;
import co.cesde.edu.scg.App.Services.StudentServices;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServices studentService;

    public StudentController(StudentServices studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void crearEstudiante(
            @RequestBody Students student
    ) {
        studentService.save(student);
    }

    @GetMapping("/{id}")
    public Students buscarPorId(
            @PathVariable long id
    ) {
        return studentService.FindById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(
            @PathVariable long id
    ) {
        studentService.deleteBy(id);
    }

    @GetMapping
    public List<Students> listarEstudiantes() {
        return studentService.FindAll();
    }

    @PutMapping("/{id}")
    public void actualizarEstudiante(
            @PathVariable long id,
            @RequestBody Students student
    ) {
        student.setId(id);
        studentService.update(student);
    }
}