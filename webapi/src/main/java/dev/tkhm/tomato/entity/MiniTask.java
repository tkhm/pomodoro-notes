package dev.tkhm.tomato.entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minitasks")
public class MiniTask {
    @Id
    public UUID id;
    public String content;

    @Column(name = "recorded_at", columnDefinition = "timestamp DEFAULT CURRENT_TIMESTAMP")
    public Timestamp recordedAt;
}
