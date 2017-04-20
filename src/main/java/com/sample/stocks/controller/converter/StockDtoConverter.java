package com.sample.stocks.controller.converter;

import org.springframework.stereotype.Component;

import com.sample.stocks.controller.api.StockDto;
import com.sample.stocks.domain.Stock;
import com.sample.stocks.domain.StockType;

import java.util.function.Function;

/**
 * Converts a Stock DTO into a Stock from the internal domain.
 */
@Component
public class StockDtoConverter implements Function<StockDto, Stock> {
    @Override
    public Stock apply(StockDto stockDto) {
        String symbol = stockDto.getSymbol();
        StockType type = StockType.valueOf(stockDto.getType());
        double fixedDividend = stockDto.getFixedDividend();
        double lastDividend = stockDto.getLastDividend();
        double parValue = stockDto.getParValue();
        double tickerPrice = stockDto.getTickerPrice();

        return new Stock(symbol, type, lastDividend, fixedDividend, parValue, tickerPrice);
    }
}
