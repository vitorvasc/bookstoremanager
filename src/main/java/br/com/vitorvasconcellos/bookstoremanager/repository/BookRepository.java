package br.com.vitorvasconcellos.bookstoremanager.repository;

import br.com.vitorvasconcellos.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
