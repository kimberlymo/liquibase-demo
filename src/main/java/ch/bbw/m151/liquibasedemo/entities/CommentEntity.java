package ch.bbw.m151.liquibasedemo.entities;

import ch.bbw.m151.liquibasedemo.entities.ArticleEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class CommentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(nullable = false)
    private String text;
    @ManyToOne(cascade = CascadeType.ALL)
    private ArticleEntity article;
}