package com.jonathancr.arithmeticOpsBackend.controllers;

import com.jonathancr.arithmeticOpsBackend.dtos.OperationRequest;
import com.jonathancr.arithmeticOpsBackend.dtos.ResultResponse;
import com.jonathancr.arithmeticOpsBackend.services.ArithmeticOperationsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webapp")
@CrossOrigin(origins = "*") // Allows to Angular consume the API
public class CalculatorController {

    private ArithmeticOperationsService arithmeticOperationsService;

    public CalculatorController(ArithmeticOperationsService arithmeticOperationsService){
        this.arithmeticOperationsService = arithmeticOperationsService;
    }

    @GetMapping("/calculator")
    public ResultResponse calculate(
            @RequestParam double value1,
            @RequestParam double value2,
            @RequestParam String operationType) {
        return arithmeticOperationsService.calculate(value1, value2, operationType);
    }

}
