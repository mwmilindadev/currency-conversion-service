package com.microservises.currencyconversionservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
}
