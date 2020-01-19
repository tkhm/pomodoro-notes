package dev.tkhm.tomato.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "minitasks")
public class MiniTask {
    @Id
    public UUID id;
    public String content;

    @Column(name = "recorded_at", columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    public Timestamp recordedAt;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "minitask_tags", joinColumns = @JoinColumn(name = "minitask_id"))
    @Column(name = "tag_name")
    public List<String> tags;
}
