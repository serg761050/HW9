package pm.academy.pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import pm.academy.driver.DriverManager;

public class WelcomePage extends BasePage {

  private int XCoordinatePariMatchButton = 300;
  private int YCoordinatePariMatchButton = 100;

  public LoginPage openLoginPage(){
    TouchAction touchAction = new TouchAction(DriverManager.getDriver());
    touchAction.tap(PointOption.point(XCoordinatePariMatchButton, YCoordinatePariMatchButton)).perform();
    return new LoginPage();
  }
}
