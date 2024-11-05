package com.exo1.exo1.mapper;

import com.exo1.exo1.dto.TaskCountPerProjectDto;
import com.exo1.exo1.dto.TaskDto;
import com.exo1.exo1.entity.Task;
import com.exo1.exo1.entity.TaskCountPerProject;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskCountPerProjectMapper {
    TaskCountPerProjectDto toDto(TaskCountPerProject task);
    TaskCountPerProject toEntity(TaskCountPerProjectDto taskDto);
    List<TaskCountPerProjectDto> toDtos(List<TaskCountPerProject> tasks);
    List<TaskCountPerProject> toEntities(List<TaskCountPerProjectDto> taskDtos);
}
