package com.jonathancr.arithmeticOpsBackend.models;

public class ResultResponse {

    private double result;
    private String message;

    public ResultResponse(double result, String message) {
        this.result = result;
        this.message = message;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
