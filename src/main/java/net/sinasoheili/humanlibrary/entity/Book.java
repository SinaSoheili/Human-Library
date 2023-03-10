package net.sinasoheili.humanlibrary.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Book {
    private String id;
    private String title;
    private String description;
    private LocalDateTime publishDate;
    private BookStatus status;
}
