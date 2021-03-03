package com.testproject.util;

import com.testproject.entity.Log;
import com.testproject.service.LogService;
import org.slf4j.Logger;

public class LogWriter {

    public static void writeLog(LogService logService, Logger logger, String serviceName, int sequence, String message){
        logger.info(serviceName + " - " + message);
        logService.saveLog(new Log(sequence, serviceName, message));
    }
}
