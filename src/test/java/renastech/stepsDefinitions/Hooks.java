package renastech.stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BrowserUtils {

    private static final Logger logger = Logger.getLogger(Hooks.class);

    @Before
    public void setup(){
        Driver.getDriver();
        logger.info("=====Chrome Driver Working fine ===== ");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfigurationsReader.getProperties("url2"));
    }
    @After
    public void lastStep(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] data =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
        Driver.tearDown();
        System.out.println("End of Test Execution");
    }
}
