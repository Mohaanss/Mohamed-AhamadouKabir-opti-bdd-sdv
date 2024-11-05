package com.exo1.exo1.repository;

import com.exo1.exo1.entity.Projet;
import com.exo1.exo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @Override
    @Query("SELECT p, t,u  from Projet p  LEFT JOIN FETCH p.tasks t LEFT JOIN FETCH p.users u")
    List<Projet> findAll();

    @Override
    @Query("SELECT p,t FROM Projet p LEFT JOIN FETCH p.tasks t WHERE p.id = :id")
    public Optional<Projet> findById(@Param("id") Long id);
}
