package br.com.vitorvasconcellos.bookstoremanager.service;

import br.com.vitorvasconcellos.bookstoremanager.dto.BookDTO;
import br.com.vitorvasconcellos.bookstoremanager.dto.MessageResponseDTO;
import br.com.vitorvasconcellos.bookstoremanager.entity.Book;
import br.com.vitorvasconcellos.bookstoremanager.exception.BookNotFoundException;
import br.com.vitorvasconcellos.bookstoremanager.mapper.BookMapper;
import br.com.vitorvasconcellos.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book BookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(BookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

    public BookDTO findById(Long id) throws BookNotFoundException {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));

        return bookMapper.toDTO(book);
    }
}
