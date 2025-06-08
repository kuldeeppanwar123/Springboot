package com.springboot.learn.Day_06_02_fetch_modes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


//@ManyToOne // Defaults to FetchMode.JOIN + FetchType.EAGER
//private Author author;
//
//@OneToMany // Defaults to FetchMode.SELECT + FetchType.LAZY
//private List<Book> books;

/*

--------------------------------------+
              |FetchType | FetchMode  |
--------------------------------------+
OneToMany     |   lazy   |   select   |
ManyToMany    |   lazy   |   select   |
OneToOne      |   eager  |    join    |
ManyToOne     |   eager  |    join    |
--------------------------------------+

FetchMode.SUBSELECT:
    -> desiged for collections(OneToMany, ManyToMany)
    -> it works by using subquery to load all elements of collection at once.
    -> can't used with single ended associations (ManyToOne, OneToOne)

OneToOne/ManyToOne:
    - default fetchmode is JOIN (single join query to get parent + associated entities)
    - use @Fetch(FetchMode.SELECT) which use two select query to get parent + associated entity
    - FetchMode.SUBSELECT can't used
    -
OneToMany:
    - deault fetchMode is SELECT
    - use SUBSELECT when accessing collection of parent entity with there associated collections. NOT use when accessing single parent entity with associated collection.
    - have to make @Transactional
    -
 */


