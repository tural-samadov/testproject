package com.testproject.service.impl;

import com.testproject.model.*;
import com.testproject.service.CalculatorService;
import com.testproject.service.LogService;
import com.testproject.util.LogWriter;
import com.testproject.util.XMLConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LogService logService;

    @Override
    public AddResponse add(Add add, int sequence) {
        // Convert Add object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Add.class, add);
        LogWriter.writeLog(logService, logger, "Add " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP add service
        Calculator calculator = new Calculator();
        int addResult = calculator.getCalculatorSoap().add(add.getIntA(), add.getIntB());
        AddResponse addResponse = new AddResponse();
        addResponse.setAddResult(addResult);

        // Convert AddResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(AddResponse.class, addResponse);
        LogWriter.writeLog(logService, logger, "Add " + sequence + ". Response to SOAP", sequence, xmlResponse);

        return addResponse;
    }

    @Override
    public SubtractResponse subtract(Subtract subtract, int sequence) {
        // Convert Subtract object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Subtract.class, subtract);
        LogWriter.writeLog(logService, logger, "Subtract " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP subtract service
        Calculator calculator = new Calculator();
        int subtractResult = calculator.getCalculatorSoap().subtract(subtract.getIntA(), subtract.getIntB());
        SubtractResponse subtractResponse = new SubtractResponse();
        subtractResponse.setSubtractResult(subtractResult);

        // Convert SubtractResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(SubtractResponse.class, subtractResponse);
        LogWriter.writeLog(logService, logger, "Subtract " + sequence + ". Response to SOAP", sequence, xmlResponse);

        return subtractResponse;
    }

    @Override
    public MultiplyResponse multiply(Multiply multiply, int sequence) {
        // Convert Multiply object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Multiply.class, multiply);
        LogWriter.writeLog(logService, logger, "Multiply " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP multiply service
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.getCalculatorSoap().multiply(multiply.getIntA(), multiply.getIntB());
        MultiplyResponse multiplyResponse = new MultiplyResponse();
        multiplyResponse.setMultiplyResult(multiplyResult);

        // Convert MultiplyResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(MultiplyResponse.class, multiplyResponse);
        LogWriter.writeLog(logService, logger, "Multiply " + sequence + ". Response to SOAP", sequence, xmlResponse);

        return multiplyResponse;
    }

    @Override
    public DivideResponse divide(Divide divide, int sequence) {
        // Convert Divide object to String XML and write "Request to SOAP" log
        String xmlRequest = XMLConverter.convertObjectToXML(Divide.class, divide);
        LogWriter.writeLog(logService, logger, "Divide " + sequence + ". Request to SOAP", sequence, xmlRequest);

        // Call SOAP divide service
        Calculator calculator = new Calculator();
        int divideResult = calculator.getCalculatorSoap().divide(divide.getIntA(), divide.getIntB());
        DivideResponse divideResponse = new DivideResponse();
        divideResponse.setDivideResult(divideResult);

        // Convert DivideResponse object to String XML and write "Response to SOAP" log
        String xmlResponse = XMLConverter.convertObjectToXML(DivideResponse.class, divideResponse);
        LogWriter.writeLog(logService, logger, "Divide " + sequence + ". Response to SOAP", sequence, xmlResponse);

        return divideResponse;
    }

}
