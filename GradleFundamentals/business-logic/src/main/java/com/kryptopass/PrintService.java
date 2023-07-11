package com.kryptopass;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintService {

    private static final Logger logger = LoggerFactory.getLogger(PrintService.class);

    public void print(MessageModel model) {
        logger.info("Printing: " + model.message());
        String message = StringUtils.trim(model.message());
        System.out.println(message);
    }
}
