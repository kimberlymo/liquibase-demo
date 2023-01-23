package ch.bbw.m151.liquibasedemo.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity {
    @Version
    private Long version = 1L;
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;
    @Column(nullable = false)
    private String title;
    @Column
    private String text;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdTs;
}
