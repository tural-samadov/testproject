package com.testproject.service;

import com.testproject.model.Subtract;
import com.testproject.service.impl.CalculatorServiceImpl;

public class SubtractService implements Runnable {

    private Subtract subtract;
    private int sequence;
    private LogService logService;

    public SubtractService(Subtract subtract, int sequence, LogService logService) {
        this.subtract = subtract;
        this.sequence = sequence;
        this.logService = logService;
    }

    @Override
    public void run() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        calculatorService.subtract(subtract, sequence, logService);
    }
}
