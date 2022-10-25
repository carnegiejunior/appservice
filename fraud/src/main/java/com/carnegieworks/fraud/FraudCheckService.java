package com.carnegieworks.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

//    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
//        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
//    }

    public boolean isFraudulentCustomer(Integer customerId){
        this.fraudCheckHistoryRepository.save(
          FraudCheckHistory.builder()
                  .customerId(customerId)
                  .isFraudster(false)
                  .build()
        );
        return false;
    }
}
