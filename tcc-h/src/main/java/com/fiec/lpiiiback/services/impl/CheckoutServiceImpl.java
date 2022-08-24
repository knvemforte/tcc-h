package com.fiec.lpiiiback.services.impl;

import com.fiec.lpiiiback.models.entities.Book;
import com.fiec.lpiiiback.models.entities.Checkout;
import com.fiec.lpiiiback.models.repositories.CheckoutRepository;
import com.fiec.lpiiiback.services.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    CheckoutRepository checkoutRepository;

    @Override
    public Checkout saveCheckout(List<Book> bookList) {
        Checkout checkout = Checkout.builder()
                .book(bookList)
                .build();
        return checkoutRepository.save(checkout);
    }
}
