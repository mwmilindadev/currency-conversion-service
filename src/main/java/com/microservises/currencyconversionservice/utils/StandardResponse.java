package com.microservises.currencyconversionservice.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardResponse {
    private int code;
    private String message;
    private Object obj;
}
