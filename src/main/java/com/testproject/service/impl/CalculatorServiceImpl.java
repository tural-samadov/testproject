package com.testproject.service.impl;

import com.testproject.model.*;
import com.testproject.service.CalculatorService;
import com.testproject.service.LogService;
import com.testproject.util.LogWriter;
import com.testproject.util.XMLConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorServiceImpl implements CalculatorService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Calculator calculator;

    public CalculatorServiceImpl() {
        this.calculator = new Calculator();
    }

    @Override
    public synchronized void add(Add add, int sequence, LogService logService) {
        // Convert Add object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Add.class, add);
        LogWriter.writeLog(logService, logger, "Add " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP add service
        int addResult = calculator.getCalculatorSoap().add(add.getIntA(), add.getIntB());
        AddResponse addResponse = new AddResponse();
        addResponse.setAddResult(addResult);

        // Convert AddResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(AddResponse.class, addResponse);
        LogWriter.writeLog(logService, logger, "Add " + sequence + ". Response to SOAP", sequence, xmlResponse);
    }

    @Override
    public synchronized void subtract(Subtract subtract, int sequence, LogService logService) {
        // Convert Subtract object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Subtract.class, subtract);
        LogWriter.writeLog(logService, logger, "Subtract " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP subtract service
        int subtractResult = calculator.getCalculatorSoap().subtract(subtract.getIntA(), subtract.getIntB());
        SubtractResponse subtractResponse = new SubtractResponse();
        subtractResponse.setSubtractResult(subtractResult);

        // Convert SubtractResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(SubtractResponse.class, subtractResponse);
        LogWriter.writeLog(logService, logger, "Subtract " + sequence + ". Response to SOAP", sequence, xmlResponse);
    }

    @Override
    public synchronized void multiply(Multiply multiply, int sequence, LogService logService) {
        // Convert Multiply object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Multiply.class, multiply);
        LogWriter.writeLog(logService, logger, "Multiply " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP multiply service
        int multiplyResult = calculator.getCalculatorSoap().multiply(multiply.getIntA(), multiply.getIntB());
        MultiplyResponse multiplyResponse = new MultiplyResponse();
        multiplyResponse.setMultiplyResult(multiplyResult);

        // Convert MultiplyResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(MultiplyResponse.class, multiplyResponse);
        LogWriter.writeLog(logService, logger, "Multiply " + sequence + ". Response to SOAP", sequence, xmlResponse);
    }

    @Override
    public synchronized void divide(Divide divide, int sequence, LogService logService) {
        // Convert Divide object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Divide.class, divide);
        LogWriter.writeLog(logService, logger, "Divide " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP divide service
        int divideResult = calculator.getCalculatorSoap().divide(divide.getIntA(), divide.getIntB());
        DivideResponse divideResponse = new DivideResponse();
        divideResponse.setDivideResult(divideResult);

        // Convert DivideResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(DivideResponse.class, divideResponse);
        LogWriter.writeLog(logService, logger, "Divide " + sequence + ". Response to SOAP", sequence, xmlResponse);
    }

}
