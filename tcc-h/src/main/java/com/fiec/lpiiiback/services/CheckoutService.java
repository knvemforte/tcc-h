package com.fiec.lpiiiback.services;

import com.fiec.lpiiiback.models.entities.Checkout;
import com.fiec.lpiiiback.models.entities.Book;

import java.util.List;

public interface CheckoutService {

    Checkout saveCheckout(List<Book> bookList);
}
