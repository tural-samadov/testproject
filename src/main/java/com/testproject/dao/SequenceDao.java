package com.testproject.dao;

import com.testproject.entity.Sequence;

public interface SequenceDao {

    Sequence saveAndGetSequenceId(Sequence sequence);
}
