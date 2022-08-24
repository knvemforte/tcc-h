package com.fiec.lpiiiback.controllers;


import com.fiec.lpiiiback.models.dto.CheckoutRequestDto;
import com.fiec.lpiiiback.models.dto.CheckoutResponseDto;
import com.fiec.lpiiiback.models.entities.Book;
import com.fiec.lpiiiback.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/checkouts")
public class CheckoutController {

    @Autowired
    CheckoutService checkoutService;

    @PostMapping
    public CheckoutResponseDto checkoutBooks(@RequestBody CheckoutRequestDto checkoutRequestDto){
        return CheckoutResponseDto.convert(checkoutService.saveCheckout(checkoutRequestDto.getBooks()
                .stream().map(p -> Book.builder()
                        .bookId(p.getBookId())
                        .name(p.getName())
                        .description(p.getDescription())
                        .bookImage(p.getBookImage())
                        .build())
                .collect(Collectors.toList())));
    }
}
