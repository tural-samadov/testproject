package com.testproject.service.impl;

import com.testproject.dao.SequenceDao;
import com.testproject.entity.Sequence;
import com.testproject.service.SequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SequenceServiceImpl implements SequenceService {

    @Autowired
    private SequenceDao sequenceDao;

    @Override
    public Sequence saveAndGetSequenceId(Sequence sequence) {
        return sequenceDao.saveAndGetSequenceId(sequence);
    }
}
