package com.sample.stocks.controller.converter;

import org.springframework.stereotype.Component;

import com.sample.stocks.controller.api.StockDto;
import com.sample.stocks.domain.Stock;

import java.util.function.Function;

/**
 * Converts a Stock from the internal domain into a Stock DTO.
 */
@Component
public class StockConverter implements Function<Stock, StockDto> {
    @Override
    public StockDto apply(Stock stock) {
        StockDto stockDto = new StockDto();

        stockDto.setSymbol(stock.getSymbol());
        stockDto.setType(stock.getType().name());
        stockDto.setFixedDividend(stock.getFixedDividend());
        stockDto.setLastDividend(stock.getLastDividend());
        stockDto.setParValue(stock.getParValue());
        stockDto.setTickerPrice(stock.getTickerPrice());

        return stockDto;
    }
}
