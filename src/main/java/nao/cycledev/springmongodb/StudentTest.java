package nao.cycledev.springmongodb;

import nao.cycledev.springmongodb.model.Student;
import nao.cycledev.springmongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentTest {

    @Autowired
    private StudentRepository studentRepository;

    public void save(){

        studentRepository.save(new Student("1", "ivan", "pavlov", 35));

    }
}
