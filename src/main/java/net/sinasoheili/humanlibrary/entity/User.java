package net.sinasoheili.humanlibrary.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    public static final String PROP_ID = "id";
    public static final String PROP_FIRST_NAME = "firstName";
    public static final String PROP_LAST_NAME = "lastName";
    public static final String PROP_EMAIL = "email";
    public static final String PROP_BIO = "bio";
    public static final String PROP_BOOKS = "books";

    @Id
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String bio;

    @OneToMany(mappedBy = Book.PROP_USER)
    private List<Book> books;
}
