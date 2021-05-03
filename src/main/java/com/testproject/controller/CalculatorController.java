package com.testproject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testproject.entity.Sequence;
import com.testproject.model.*;
import com.testproject.service.*;
import com.testproject.util.LogWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("calculate")
public class CalculatorController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LogService logService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private SequenceService sequenceService;


    @PostMapping("/add")
    public synchronized ResponseEntity<?> add(@RequestBody Add add) throws JsonProcessingException {
        // Get sequence
        int sequence = sequenceService.saveAndGetSequenceId(new Sequence()).getId();

        // Convert Add object to String json and write "Request to JSON" log
        String jsonRequest = objectMapper.writeValueAsString(add);
        LogWriter.writeLog(logService, logger, "Add " + sequence + ". Request to JSON", sequence, jsonRequest);

        // Call the Calculator Add service
        AddResponse addResponse = calculatorService.add(add, sequence);
        return new ResponseEntity<>(addResponse, HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public synchronized ResponseEntity<?> subtract(@RequestBody Subtract subtract) throws JsonProcessingException {
        // Get sequence
        int sequence = sequenceService.saveAndGetSequenceId(new Sequence()).getId();

        // Convert Subtract object to String json and write "Request to JSON" log
        String jsonRequest = objectMapper.writeValueAsString(subtract);
        LogWriter.writeLog(logService, logger, "Subtract " + sequence + ". Request to JSON", sequence, jsonRequest);

        // Call the Calculator Subtract service
        SubtractResponse subtractResponse = calculatorService.subtract(subtract, sequence);
        return new ResponseEntity<>(subtractResponse, HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public synchronized ResponseEntity<?> multiply(@RequestBody Multiply multiply) throws JsonProcessingException {
        // Get sequence
        int sequence = sequenceService.saveAndGetSequenceId(new Sequence()).getId();

        // Convert Multiply object to String json and write "Request to JSON" log
        String jsonRequest = objectMapper.writeValueAsString(multiply);
        LogWriter.writeLog(logService, logger, "Multiply " + sequence + ". Request to JSON", sequence, jsonRequest);

        // Call the Calculator Multiply service
        MultiplyResponse multiplyResponse = calculatorService.multiply(multiply, sequence);
        return new ResponseEntity<>(multiplyResponse, HttpStatus.OK);
    }

    @PostMapping("/divide")
    public synchronized ResponseEntity<?> divide(@RequestBody Divide divide) throws JsonProcessingException {
        // Get sequence
        int sequence = sequenceService.saveAndGetSequenceId(new Sequence()).getId();

        // Convert Divide object to String json and write "Request to JSON" log
        String jsonRequest = objectMapper.writeValueAsString(divide);
        LogWriter.writeLog(logService, logger, "Divide " + sequence + ". Request to JSON", sequence, jsonRequest);

        // Call the Calculator Divide service
        DivideResponse divideResponse = calculatorService.divide(divide, sequence);
        return new ResponseEntity<>(divideResponse, HttpStatus.OK);
    }

}
