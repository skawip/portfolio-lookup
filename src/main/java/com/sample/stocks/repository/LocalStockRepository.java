package com.sample.stocks.repository;

import org.springframework.stereotype.Repository;

import com.sample.stocks.domain.Stock;

/**
 * Local repository for stocks.
 *
 * @see Stock
 * @see LocalRepository
 */
@Repository
public class LocalStockRepository extends LocalRepository<Stock> {

    public LocalStockRepository() {
        super();
    }

}
