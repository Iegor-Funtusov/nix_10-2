package ua.com.alevel.service;

import ua.com.alevel.entity.Author;
import ua.com.alevel.entity.Book;

public interface AssociateService {
    void addAuthorToBook(Book book, Author author);

    void addBookToAuthor(Author author, Book book);
}
