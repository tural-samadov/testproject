package com.testproject.service;

import com.testproject.model.Add;
import com.testproject.service.impl.CalculatorServiceImpl;

public class AddService implements Runnable{

    private Add add;
    private int sequence;
    private LogService logService;

    public AddService(Add add, int sequence, LogService logService) {
        this.add = add;
        this.sequence = sequence;
        this.logService = logService;
    }

    @Override
    public void run() {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        calculatorService.add(add, sequence, logService);
    }
}
