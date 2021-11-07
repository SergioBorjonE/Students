package org.generation.Students.controller;
import org.generation.Students.StudentsApplication;
import org.generation.Students.data.entity.Student;
import org.generation.Students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class StudentsController {

    private final StudentService studentService;

    public StudentsController(@Autowired StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Iterable<Student> all(){
        return studentService.all();
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable int id){
        return studentService.get(id);
    }

    @PostMapping("/student")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }

    @PutMapping("/student")
    public void update(@RequestBody Student student){
        studentService.save(student);
    }

    @DeleteMapping("/student/{id}")
    public void delete(@PathVariable int id) {
        studentService.delete(id);
    }
}
