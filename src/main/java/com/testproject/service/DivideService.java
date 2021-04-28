package com.testproject.service;

import com.testproject.model.Divide;
import com.testproject.service.impl.CalculatorServiceImpl;

public class DivideService implements Runnable {

    private Divide divide;
    private int sequence;
    private LogService logService;

    public DivideService(Divide divide, int sequence, LogService logService) {
        this.divide = divide;
        this.sequence = sequence;
        this.logService = logService;
    }

    @Override
    public void run() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        calculatorService.divide(divide, sequence, logService);
    }
}
