package utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.*;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShots {
 
              public static void captureScreenShot(WebDriver driver, String ScreenShotName)
              {
                            try {                
                            	         String path=System.getProperty("user.dir")+"/screenshots/";
                                         File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                                         FileUtils.copyFile(screenshot,new File(path+ScreenShotName+".jpg"));
                                     } catch (Exception e)
                                       {
                                           System.out.println(e.getMessage());
                                            e.printStackTrace();
                                        }
                  }
}