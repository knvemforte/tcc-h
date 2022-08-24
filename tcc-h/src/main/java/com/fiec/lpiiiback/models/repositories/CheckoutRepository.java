package com.fiec.lpiiiback.models.repositories;

import com.fiec.lpiiiback.models.entities.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, String> {
}
