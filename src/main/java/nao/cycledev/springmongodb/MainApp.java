package nao.cycledev.springmongodb;

import nao.cycledev.springmongodb.config.AppConfig;
import nao.cycledev.springmongodb.config.MongoDBConfig;
import nao.cycledev.springmongodb.model.Student;
import nao.cycledev.springmongodb.repository.StudentRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MongoDBConfig.class, AppConfig.class);

        StudentRepository studentRepository = (StudentRepository) ctx.getBean("studentRepository");


        Student student = studentRepository.findOne("1");
        studentRepository.save(student);

        //studentRepository.deleteAll();
        //studentRepository.save(new Student("1", "qqq", "wwww", 15));


    }
}
