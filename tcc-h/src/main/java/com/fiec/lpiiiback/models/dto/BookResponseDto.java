package com.fiec.lpiiiback.models.dto;


import com.fiec.lpiiiback.models.entities.Book;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookResponseDto {
    private String bookId;

    private String name;
    private String description;


    private String bookImage;

    public static BookResponseDto convert(Book book){

        return BookResponseDto.builder()
                .name(book.getName())
                .description(book.getDescription())
                .bookId(book.getBookId())
                .bookImage(book.getBookImage())
                .build();
    }
}
