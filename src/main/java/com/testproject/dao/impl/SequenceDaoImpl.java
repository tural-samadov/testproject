package com.testproject.dao.impl;

import com.testproject.dao.SequenceDao;
import com.testproject.entity.Sequence;
import com.testproject.repository.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SequenceDaoImpl implements SequenceDao {

    @Autowired
    private SequenceRepository sequenceRepository;

    @Override
    public Sequence saveAndGetSequenceId(Sequence sequence) {
        return sequenceRepository.save(sequence);
    }
}
