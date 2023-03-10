package net.sinasoheili.humanlibrary.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Book {

    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    private String description;

    private LocalDateTime publishDate;

    @Enumerated(EnumType.STRING)
    private BookStatus status;
}
