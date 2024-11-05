package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import com.exo1.exo1.entity.Task;
import com.exo1.exo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Override
    @Query("select t from Task t  where t.id=:id")
    public Optional<Task> findById(@Param("id") Long id);

    @Override
    @Query("SELECT t FROM  Task t")
    List<Task> findAll();
}
