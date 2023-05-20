package com.microservises.currencyconversionservice.controller;

import com.microservises.currencyconversionservice.entity.CurrencyConversion;
import com.microservises.currencyconversionservice.utils.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConverSionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{qty}")
    public ResponseEntity<StandardResponse>getDetails(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal qty
            ){
        CurrencyConversion currencyConversion= new CurrencyConversion(1l,"USD","LKR",BigDecimal.valueOf(50),BigDecimal.valueOf(500));
        return  new ResponseEntity<>(new StandardResponse(200,"ok",currencyConversion), HttpStatus.OK);
    }
}
