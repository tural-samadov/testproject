package com.testproject.service;

import com.testproject.model.*;

public interface CalculatorService {

    void add(Add add, int sequence, LogService logService);
    void subtract(Subtract subtract, int sequence, LogService logService);
    void multiply(Multiply multiply, int sequence, LogService logService);
    void divide(Divide divide, int sequence, LogService logService);
}
