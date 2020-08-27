package com.ofemmy.librarymanager.repositories.book;

import com.ofemmy.librarymanager.models.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
