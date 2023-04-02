package com.example.application.repo;

import com.example.application.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepo  extends JpaRepository<Todo,Long> {



}
