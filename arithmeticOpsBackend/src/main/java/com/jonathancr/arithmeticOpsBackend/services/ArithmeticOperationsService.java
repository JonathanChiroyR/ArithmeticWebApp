package com.jonathancr.arithmeticOpsBackend.services;

import com.jonathancr.arithmeticOpsBackend.dtos.ResultResponse;
import org.springframework.stereotype.Service;

@Service
public class ArithmeticOperationsService {

    //Contains all the logic of mathematical operations
    public ResultResponse calculate(double value1, double value2, String operationType){

        double result;
        String response= "Operation Done";

        //Evaluates the operation type sent by user to generate the result
        switch (operationType){
            case "add": result = value1 + value2; break;
            case "substract": result = value1 - value2; break;
            case "multiply": result = value1 * value2; break;
            case "divide":
                if (value2 == 0){
                    //Evaluates the zero division error
                    return new ResultResponse(0, "Second value can't be zero.");
                } else {
                    result = value1 / value2; break;
                }
                //In case of no opertaion type match, sents an error message.
            default: return new ResultResponse(0, "Unknown operation.");
        }
        //Sends the final answer to user
        return new ResultResponse(result,response);

    }

}
