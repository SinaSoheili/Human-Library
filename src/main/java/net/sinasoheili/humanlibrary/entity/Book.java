package net.sinasoheili.humanlibrary.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Book {

    public static final String PROP_ID = "id";
    public static final String PROP_TITLE = "title";
    public static final String PROP_DESCRIPTION = "description";
    public static final String PROP_PUBLISH_DATE = "publishDate";
    public static final String PROP_STATUS = "status";
    public static final String PROP_USER = "user";

    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    private String description;

    private LocalDateTime publishDate;

    @Enumerated(EnumType.STRING)
    private BookStatus status;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;
}
