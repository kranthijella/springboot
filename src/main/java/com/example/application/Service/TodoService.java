package com.example.application.Service;

import com.example.application.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.application.Entity.Todo;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private StudentRepo repo;

    public List<Todo> Todolist() {
        return repo.findAll();
    }
    public void poststu(Todo todo) {
        repo.save(todo);
    }
    public void delete(Long taskid){
       boolean exists =  repo.existsById(taskid);
       if(exists){
           repo.deleteById(taskid);
       }
       else {
           throw new IllegalStateException("could not find id");
           
       }
    }

    public void update(Todo todo){
        Todo prev = repo.findById(todo.getId()).orElse(null);
        prev.setDescription(todo.getDescription());
        prev.setName(todo.getName());
        prev.setStatus(todo.isStatus());

        repo.save(prev);
    }



}
