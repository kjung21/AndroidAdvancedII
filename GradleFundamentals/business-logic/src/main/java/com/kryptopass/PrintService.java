package com.kryptopass;

import org.apache.commons.lang3.StringUtils;

public class PrintService {
    public void print(MessageModel model) {
        String message = StringUtils.trim(model.message());
        System.out.println(message);
    }
}
