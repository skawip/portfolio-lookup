package com.sample.stocks.controller.converter;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.stereotype.Component;

import com.sample.stocks.controller.api.TradeDto;
import com.sample.stocks.domain.Trade;
import com.sample.stocks.domain.TradeIndicator;

import java.util.function.Function;

/**
 * Converts a Trade DTO into a Trade from the internal domain.
 */
@Component
public class TradeDtoConverter implements Function<TradeDto, Trade> {
    @Override
    public Trade apply(TradeDto tradeDto) {
        double price = tradeDto.getPrice();
        int quantity = tradeDto.getQuantity();
        String stockSymbol = tradeDto.getStockSymbol();
        TradeIndicator indicator = TradeIndicator.valueOf(tradeDto.getIndicator());

        return new Trade(
                new DateTime(DateTimeZone.UTC).getMillis(),
                price, quantity, stockSymbol, indicator);
    }
}
