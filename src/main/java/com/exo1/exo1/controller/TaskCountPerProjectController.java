package com.exo1.exo1.controller;

import com.exo1.exo1.dto.TaskCountPerProjectDto;
import com.exo1.exo1.dto.TaskDto;
import com.exo1.exo1.service.TaskCountPerProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taskcountperproject")
public class TaskCountPerProjectController {
    @Autowired
    private TaskCountPerProjectService taskCountPerProjectService;

    @GetMapping
    public ResponseEntity<List<TaskCountPerProjectDto>> findAll()
    {
        return ResponseEntity.ok(taskCountPerProjectService.findAll());
    }
}
