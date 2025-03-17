package com.jonathancr.arithmeticOpsBackend.controllers;

import com.jonathancr.arithmeticOpsBackend.models.ResultResponse;
import com.jonathancr.arithmeticOpsBackend.services.ArithmeticOperationsService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private ArithmeticOperationsService arithmeticOperationsService;

    public CalculatorController(ArithmeticOperationsService arithmeticOperationsService){
        this.arithmeticOperationsService = arithmeticOperationsService;
    }

    @GetMapping("/calculator/{value1}/{value2}/{operationType}")
    public ResultResponse calculate(@PathVariable double value1,@PathVariable double value2,@PathVariable String operationType){
        return arithmeticOperationsService.calculate(value1,value2,operationType);
    }

}
