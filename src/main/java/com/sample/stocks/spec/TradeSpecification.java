package com.sample.stocks.spec;

import org.joda.time.DateTime;

import com.sample.stocks.domain.Trade;

import java.util.function.Predicate;

/**
 * Factory for trade specifications.
 */
public class TradeSpecification {

    public static Predicate<Trade> within(DateTime from, DateTime to) {
        // returns true if no time difference
        // otherwise returns true if time within range
        return trade -> from.getMillis() == to.getMillis()
                || (from.getMillis() <= trade.getTime() && trade.getTime() < to.getMillis());
    }

    public static Predicate<Trade> forStock(String stockSymbol) {
        return trade -> trade.getStockSymbol().equals(stockSymbol);
    }
}
