package com.testproject.service;

import com.testproject.model.Multiply;
import com.testproject.service.impl.CalculatorServiceImpl;

public class MultiplyService implements Runnable {

    private Multiply multiply;
    private int sequence;
    private LogService logService;

    public MultiplyService(Multiply multiply, int sequence, LogService logService) {
        this.multiply = multiply;
        this.sequence = sequence;
        this.logService = logService;
    }

    @Override
    public void run() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        calculatorService.multiply(multiply, sequence, logService);
    }
}
