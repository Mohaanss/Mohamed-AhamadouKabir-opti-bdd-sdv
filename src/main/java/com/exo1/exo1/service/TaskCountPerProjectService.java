package com.exo1.exo1.service;

import com.exo1.exo1.dto.TaskCountPerProjectDto;
import com.exo1.exo1.dto.TaskDto;
import com.exo1.exo1.mapper.ProjetMapper;
import com.exo1.exo1.mapper.TaskCountPerProjectMapper;
import com.exo1.exo1.repository.TaskCountPerProjectRepository;
import com.exo1.exo1.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskCountPerProjectService {
    private TaskCountPerProjectMapper taskCountPerProjectMapper;
    private TaskCountPerProjectRepository taskCountPerProjectRepository;

    public List<TaskCountPerProjectDto> findAll() {
        return taskCountPerProjectMapper.toDtos(taskCountPerProjectRepository.findAll());
    }
}
