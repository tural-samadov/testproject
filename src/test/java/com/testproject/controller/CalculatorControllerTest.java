package com.testproject.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testproject.entity.Sequence;
import com.testproject.model.*;
import com.testproject.service.CalculatorService;
import com.testproject.service.LogService;
import com.testproject.service.SequenceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = CalculatorController.class)
public class CalculatorControllerTest {

    private final static String CONTENT_TYPE = "application/json";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private CalculatorService calculatorService;

    @MockBean
    private LogService logService;

    @MockBean
    private SequenceService sequenceService;

    @Test
    public void addTest() throws Exception {
        // given
        Add add = new Add();
        add.setIntA(2);
        add.setIntB(5);
        Sequence sequenceObj = mock(Sequence.class);

        // when
        when(sequenceService.saveAndGetSequenceId(ArgumentMatchers.any(Sequence.class))).thenReturn(sequenceObj);
        mockMvc.perform(post("/calculate/add")
                .contentType(CONTENT_TYPE)
                .content(objectMapper.writeValueAsString(add)))
                .andExpect(status().isOk());
    }

    @Test
    public void subtractTest() throws Exception {
        // given
        Subtract subtract = new Subtract();
        subtract.setIntA(10);
        subtract.setIntB(5);
        Sequence sequenceObj = mock(Sequence.class);

        // when
        when(sequenceService.saveAndGetSequenceId(ArgumentMatchers.any(Sequence.class))).thenReturn(sequenceObj);
        mockMvc.perform(post("/calculate/subtract")
                .contentType(CONTENT_TYPE)
                .content(objectMapper.writeValueAsString(subtract)))
                .andExpect(status().isOk());
    }

    @Test
    public void multiplyTest() throws Exception {
        // given
        Multiply multiply = new Multiply();
        multiply.setIntA(6);
        multiply.setIntB(3);
        Sequence sequenceObj = mock(Sequence.class);

        // when
        when(sequenceService.saveAndGetSequenceId(ArgumentMatchers.any(Sequence.class))).thenReturn(sequenceObj);
        mockMvc.perform(post("/calculate/multiply")
                .contentType(CONTENT_TYPE)
                .content(objectMapper.writeValueAsString(multiply)))
                .andExpect(status().isOk());
    }

    @Test
    public void divideTest() throws Exception {
        // given
        Divide divide = new Divide();
        divide.setIntA(4);
        divide.setIntB(2);
        Sequence sequenceObj = mock(Sequence.class);

        // when
        when(sequenceService.saveAndGetSequenceId(ArgumentMatchers.any(Sequence.class))).thenReturn(sequenceObj);
        mockMvc.perform(post("/calculate/divide")
                .contentType(CONTENT_TYPE)
                .content(objectMapper.writeValueAsString(divide)))
                .andExpect(status().isOk());
    }
}
