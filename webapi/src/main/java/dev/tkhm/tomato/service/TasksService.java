package dev.tkhm.tomato.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dev.tkhm.tomato.entity.MiniTask;
import dev.tkhm.tomato.model.Task;

@ApplicationScoped
public class TasksService {

    @Inject
    EntityManager em;

    public List<Task> fetchTasks() {
        TypedQuery<MiniTask> query = em.createQuery("SELECT mt FROM MiniTask mt", MiniTask.class);
        List<MiniTask> result = query.getResultList();

        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task().content(result.get(0).content));
        return taskList;
    }
}
