package com.jonathancr.arithmeticOpsBackend.services;

import com.jonathancr.arithmeticOpsBackend.models.ResultResponse;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticOperationsService {

    public ResultResponse calculate(double value1, double value2, String operationType){

        double result;
        String response= "Operation Done";

        switch (operationType){
            case "add": result = value1 + value2; break;
            case "substract": result = value1 - value2; break;
            case "multiply": result = value1 * value2; break;
            case "divide":
                if (value2 == 0){
                    return new ResultResponse(0, "Second value can't be zero.");
                } else {
                    result = value1 / value2; break;
                }
            default: return new ResultResponse(0, "Unknown operation.");
        }
        return new ResultResponse(result,response);

    }

}
