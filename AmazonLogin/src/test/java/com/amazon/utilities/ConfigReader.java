package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private ConfigReader(){}

    public static Properties properties;
    static {

        String path = "C:\\Users\\soner\\IdeaProjects\\AmazonLogin\\Configuration.properties";

        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
