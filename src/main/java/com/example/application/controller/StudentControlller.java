package com.example.application.controller;

import com.example.application.Entity.Todo;
import com.example.application.Service.TodoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping(value = "api")
public class StudentControlller {

    @Autowired
    private TodoService todoService;

    @GetMapping("/list")
    public ResponseEntity<List<Todo>> getStudents(){
        return new ResponseEntity<List<Todo>>(todoService.Todolist(),HttpStatus.OK);
    }

    @PostMapping("/student")
    public void Poststudent(@RequestBody Todo todo){
        todoService.poststu(todo);
    }

    @DeleteMapping(path = "/student/{todoId}")
    public void deleteStudent(@PathVariable Long todoId){
        todoService.delete(todoId);
    }

    @PutMapping(path = "/student/update/{todoId}")
    public void updateStudent(@PathVariable Long todoId, @RequestBody Todo todo){
        todoService.update(todo);

    }
}
