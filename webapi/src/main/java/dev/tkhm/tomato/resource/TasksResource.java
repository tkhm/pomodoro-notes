package dev.tkhm.tomato.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import dev.tkhm.tomato.api.TasksApi;
import dev.tkhm.tomato.model.Task;
import dev.tkhm.tomato.service.TasksService;

public class TasksResource implements TasksApi {
    @Inject
    TasksService service;

    @Override
    public List<Task> tasksGet() {
        var taskList = service.fetchTasks();
        return taskList;
    }

    @Override
    public void tasksPost(@Valid final Task task) {
        // TODO Auto-generated method stub
    }
}