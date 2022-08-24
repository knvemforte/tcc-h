package com.fiec.lpiiiback.models.dto;

import com.fiec.lpiiiback.models.entities.Book;
import com.fiec.lpiiiback.models.entities.Checkout;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class CheckoutResponseDto {
    private String id;
    private Date createdOn;
    private Date updatedOn;
    List<BookResponseDto> book;

    public static CheckoutResponseDto convert(Checkout checkout){
        List<Book> bookList = checkout.getBook();
        return CheckoutResponseDto.builder()
                .id(checkout.getCheckoutId())
                .createdOn(checkout.getCreatedOn())
                .updatedOn(checkout.getUpdatedOn())
                .book(bookList.stream().map(BookResponseDto::convert).collect(Collectors.toList()))
                .build();
    }
}
