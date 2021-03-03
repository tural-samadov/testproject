package com.testproject.service.impl;

import com.testproject.dao.LogDao;
import com.testproject.entity.Log;
import com.testproject.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public Log saveLog(Log log) {
        return logDao.saveLog(log);
    }
}
