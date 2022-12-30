package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EventPage extends BasePage {

  public EventPage() {
    super();
  }

  @AndroidFindBy(xpath = "//*[contains(@text,'П1')]")
  private MobileElement p1;

  @AndroidFindBy(xpath = "//*[@text='LOG IN']")
  private MobileElement loginButton;

  public EventPage placeBetP1() {
    waitForExpectedElement(p1);
    p1.click();
    return this;
  }

  public boolean isLoginDisplayed() {
    waitForExpectedElement(loginButton);
    return loginButton.isDisplayed();
  }


}
