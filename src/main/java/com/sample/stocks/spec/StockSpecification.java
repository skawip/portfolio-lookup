package com.sample.stocks.spec;

import java.util.function.Predicate;

import com.sample.stocks.domain.Stock;

/**
 * Factory for trade specifications.
 */
public class StockSpecification {

    public static Predicate<Stock> withSymbol(String symbol) {
        return stock -> stock.getSymbol().equals(symbol);
    }

}
