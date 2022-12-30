package pm.academy.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SportPage extends BasePage {

  public SportPage() {
    super();
  }

  @AndroidFindBy(xpath = "//*[@text='Увесь live']")
  private MobileElement allLive;

  @AndroidFindBy(xpath = "//android.view.View[@resource-id='line-holder']/android.widget.Button[2]")
  private MobileElement firstEvent;

  public boolean isSportPageOpen() {
    waitForExpectedElement(allLive);
    return allLive.isDisplayed();
  }

  public EventPage openEventPage() {
    firstEvent.click();
    return new EventPage();
  }


}
