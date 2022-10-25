package com.carnegieworks.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor // With this, i don't need to use the the body of the constructor below
public class FraudController {

    private final FraudCheckService fraudCheckService;

    // If i'm using the lombok, how i am, i don't need to explicity it in here
//    public FraudController(FraudCheckService fraudCheckService) {
//        this.fraudCheckService = fraudCheckService;
//    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable(value = "customerId") Integer customerId){
        boolean isFraudulentCustomer = this.fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
