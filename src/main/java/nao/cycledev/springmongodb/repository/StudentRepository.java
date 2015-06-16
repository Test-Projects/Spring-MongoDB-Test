package nao.cycledev.springmongodb.repository;

import nao.cycledev.springmongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

interface StudentRepository  extends MongoRepository<Student, Long> {
}
