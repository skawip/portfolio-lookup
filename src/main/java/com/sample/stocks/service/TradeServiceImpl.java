package com.sample.stocks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.stocks.domain.Trade;
import com.sample.stocks.repository.GenericRepository;

@Service
public class TradeServiceImpl implements TradeService {
    private final GenericRepository<Trade> tradeRepository;

    @Autowired
    public TradeServiceImpl(GenericRepository<Trade> tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    @Override
    public void recordTrade(Trade trade) {
        tradeRepository.save(trade);
    }
}
