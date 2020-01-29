package dev.tkhm.tomato.resource;

import java.util.List;

import javax.inject.Inject;

import dev.tkhm.tomato.api.TagsApi;
import dev.tkhm.tomato.service.TasksService;

public class TagsResource implements TagsApi {
    @Inject
    TasksService service;

    @Override
    public List<String> tagsGet() {
        // TODO Auto-generated method stub
        return null;
    }
}