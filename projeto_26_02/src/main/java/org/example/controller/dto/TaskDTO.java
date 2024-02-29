package org.example.controller.dto;

import lombok.Data;
import org.example.model.TaskStatus;

@Data
public class TaskDTO {
    private String title;
    private TaskStatus status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
