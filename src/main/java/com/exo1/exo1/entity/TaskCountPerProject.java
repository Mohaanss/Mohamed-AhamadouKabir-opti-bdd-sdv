package com.exo1.exo1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

@Entity
@Immutable // Indique que la vue est en lecture seule
@Table(name = "task_count_per_project") // Correspond à la vue matérialisée
public class TaskCountPerProject {

    @Id
    @Column(name = "projet_id")
    private Long projetId;

    @Column(name = "task_count")
    private Long taskCount;

    // Getters et setters
    public Long getProjetId() {
        return projetId;
    }

    public void setProjetId(Long projetId) {
        this.projetId = projetId;
    }

    public Long getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Long taskCount) {
        this.taskCount = taskCount;
    }
}