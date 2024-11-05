package com.exo1.exo1.repository;

import com.exo1.exo1.entity.TaskCountPerProject;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskCountPerProjectRepository extends JpaRepository<TaskCountPerProject, Long> {
    @Modifying
    @Transactional
    @Query(value = "REFRESH MATERIALIZED VIEW task_count_per_project", nativeQuery = true)
    void refreshMaterializedView();
}
