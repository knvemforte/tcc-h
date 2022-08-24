package com.fiec.lpiiiback.models.dto;

import com.fiec.lpiiiback.models.entities.Checkout;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutRequestDto {

    List<BookResponseDto> books;

}
