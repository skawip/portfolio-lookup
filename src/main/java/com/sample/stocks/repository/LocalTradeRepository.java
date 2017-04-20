package com.sample.stocks.repository;

import org.springframework.stereotype.Repository;

import com.sample.stocks.domain.Trade;

/**
 * Local repository for trades.
 *
 * @see Trade
 * @see LocalRepository
 */
@Repository
public class LocalTradeRepository extends LocalRepository<Trade> {

    public LocalTradeRepository() {
        super();
    }

}
