package com.testproject.service;

import com.testproject.entity.Sequence;

public interface SequenceService {

    Sequence saveAndGetSequenceId(Sequence sequence);
}
