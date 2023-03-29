package mk.ukim.finki.emt.lab2application.service;

import mk.ukim.finki.emt.lab2application.model.Book;
import mk.ukim.finki.emt.lab2application.model.enums.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Page<Book> findAllWithPagination(Pageable pageable);
    Optional<Book> addBook(String name, Category category, Long authorId, Integer availableCopies);
    void deleteBook(Long id);
    Optional<Book> editBook(Long id, String name, Category category, Long authorId, Integer availableCopies);
    Optional<Book> markAsTaken(String name);

}
