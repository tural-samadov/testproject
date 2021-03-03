package com.testproject.dao.impl;

import com.testproject.dao.LogDao;
import com.testproject.entity.Log;
import com.testproject.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LogDaoImpl implements LogDao {

    @Autowired
    private LogRepository logRepository;

    @Override
    public Log saveLog(Log log) {
        return logRepository.save(log);
    }
}
