package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static void loadConfig() {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("config.properties file not found.");
        }
    }

    public static String get(String key) {
        if (properties == null) {
            loadConfig();
        }
        return properties.getProperty(key);
    }
}

