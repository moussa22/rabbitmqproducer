package com.udemy.rabbitmq.controller;

import com.udemy.rabbitmq.entities.Etudiant;
import com.udemy.rabbitmq.json.Student;
import com.udemy.rabbitmq.producer.IProducer;
import com.udemy.rabbitmq.repositories.EtudiantRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {
    Student student=new Student();
    Etudiant etudiant=new Etudiant();
    @Autowired
    EtudiantRepositories etudiantRepositories;
    @Autowired
    IProducer iProducer;
@GetMapping("/{message}/send")
    public String sendMessage(@PathVariable("message") String message) {

    iProducer.producerMessage(message);

        return "Done";

    }

    @GetMapping("/send")
    public String sendStudent() {

   // Student student=Student.builder().age(20).firstname("toto").name("tata").build();

   // Etudiant etudiant=Etudiant.builder().age(student.getAge()).nom(student.getName()).prenom(student.getFirstname()).build();

        student.setAge(20);
        student.setFirstname("toto");
        student.setName("tata");

        etudiant.setAge(student.getAge());

        etudiant.setNom(student.getName());
        etudiant.setPrenom(student.getFirstname());

        etudiantRepositories.save(etudiant);

    iProducer.producerStudent(student);

        return student.toString();

    }

    @PostMapping("/save")
    public ResponseEntity saveStudent(@RequestBody Student student) {

       if(student==null){
           ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Object must be not null");
       }

        //student.setAge(20);
      //  student.setFirstname("toto");
       // student.setName("tata");

        etudiant.setAge(student.getAge());

        etudiant.setNom(student.getName());
        etudiant.setPrenom(student.getFirstname());

        etudiantRepositories.save(etudiant);

        iProducer.producerStudent(student);

        return ResponseEntity.ok(student);

    }

}
