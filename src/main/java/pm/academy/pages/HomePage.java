package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

  public HomePage() {
    super();
  }

  @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sports\"])[1]")
  private MobileElement sportButton;

  public SportPage openSportPage() {
    waitForExpectedElement(sportButton);
    sportButton.click();
    return new SportPage();
  }
}
