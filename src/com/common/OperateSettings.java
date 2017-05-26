package com.common;

import java.util.Properties;   
import java.io.InputStream;   
import java.io.IOException;   
  
/**  
* 
*/   
public final class OperateSettings {   
    private static String browser;        
    private static String ieDriverPath;
    private static String fireFoxDriverPath;
    private static String chromeDriverPath;
    private static String dataPath; 
    private static String screenshotPath;
  
    static {   
        Properties prop = new Properties();   
        InputStream is = Object.class.getResourceAsStream("/settings.properties");  
        try {   
            prop.load(is);  
            browser = prop.getProperty("Browser").trim();
            ieDriverPath = prop.getProperty("IEDriverPath").trim();
            fireFoxDriverPath = prop.getProperty("FireFoxDriverPath").trim();
            chromeDriverPath = prop.getProperty("ChromeDriverPath").trim();   
            dataPath = prop.getProperty("DataPath").trim(); 
            screenshotPath = prop.getProperty("ScreenshotPath").trim(); 
        } catch (IOException e) {   
            e.printStackTrace();   
        }   
    }   
  
    /**  
     * A private constructor that does not need to create an object 
     */   
    private OperateSettings() {   
    }   
  
    //Return each property.
    public static String getBrowser() {   
        return browser;   
    } 
    
    public static String getIEDriverPath() {   
        return ieDriverPath;   
    }   
  
    public static String getFireFoxDriverPath() {   
        return fireFoxDriverPath;   
    }   
  
    public static String getChromeDriverPath() {   
        return chromeDriverPath;   
    }   
  
  
    public static String getDataPath() {   
        return dataPath;   
    }   
  
    public static String getScreenshotPath() {   
        return screenshotPath;   
    }   
  
}  