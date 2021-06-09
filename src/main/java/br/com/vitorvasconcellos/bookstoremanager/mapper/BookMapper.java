package br.com.vitorvasconcellos.bookstoremanager.mapper;

import br.com.vitorvasconcellos.bookstoremanager.dto.BookDTO;
import br.com.vitorvasconcellos.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
