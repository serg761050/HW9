package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

  public LoginPage() {
    super();
  }

  @AndroidFindBy(xpath = "//*[@text='Sign up page title']//../android.widget.Button")
  private MobileElement buttonCross;

  public HomePage clickCrossButton() {
    waitForExpectedElement(buttonCross);
    buttonCross.click();
    return new HomePage();
  }
}
