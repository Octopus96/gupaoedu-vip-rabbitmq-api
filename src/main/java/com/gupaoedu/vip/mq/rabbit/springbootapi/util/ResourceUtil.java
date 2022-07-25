package com.gupaoedu.vip.mq.rabbit.springbootapi.util;

import java.util.ResourceBundle;


public class ResourceUtil {
    private static final ResourceBundle resourceBundle;

    static{
        resourceBundle = ResourceBundle.getBundle("rabbitmq");
    }

    public static String getKey(String key){
        return resourceBundle.getString(key);
    }

}
