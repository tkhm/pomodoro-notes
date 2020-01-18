package dev.tkhm.tomato.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minitask_tags")
public class MiniTaskTag {
    @Id
    public String id;
    @Column(name = "minitask_id")
    public String minitaskId;
    @Column(name = "tag_name")
    public String tagName;
}
