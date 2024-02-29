package org.example.service;

import org.example.controller.dto.TaskDTO;
import org.example.model.Task;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public Task createTask(TaskDTO taskDTO) {
        Task task = new Task();
        task.setId(counter.incrementAndGet());
        task.setTitle(taskDTO.getTitle());
        task.setStatus(taskDTO.getStatus());

        task.put(task.getId(), task);
        return task;
    }
}
