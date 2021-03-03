package com.testproject.service;

import com.testproject.model.*;

public interface CalculatorService {

    AddResponse add(Add add, int sequence);
    SubtractResponse subtract(Subtract subtract, int sequence);
    MultiplyResponse multiply(Multiply multiply, int sequence);
    DivideResponse divide(Divide divide, int sequence);
}
