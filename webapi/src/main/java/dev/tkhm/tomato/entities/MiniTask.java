package dev.tkhm.tomato.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minitasks")
public class MiniTask {
    @Id
    public String id;
    public String datetime;
    public String content;
}
