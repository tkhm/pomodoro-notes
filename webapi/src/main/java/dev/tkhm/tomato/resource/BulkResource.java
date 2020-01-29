package dev.tkhm.tomato.resource;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import dev.tkhm.tomato.api.BulkApi;
import dev.tkhm.tomato.model.Task;
import dev.tkhm.tomato.service.TasksService;

public class BulkResource implements BulkApi {
    @Inject
    TasksService service;

    @Override
    public void postBulk(@Valid List<Task> task) {
        // TODO Auto-generated method stub
        
    }
}