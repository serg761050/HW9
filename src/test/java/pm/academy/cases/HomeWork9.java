package pm.academy.cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pm.academy.base.BaseTest;
import pm.academy.pages.WelcomePage;

public class HomeWork9 extends BaseTest {

  @Test
  public void placeBetP1(){
    var welcomePage = new WelcomePage();
    var sportPage = welcomePage
        .openLoginPage()
        .clickCrossButton()
        .openSportPage();
    Assert.assertTrue(sportPage.isSportPageOpen());

    var evenPage = sportPage
        .openEventPage()
        .placeBetP1();
    Assert.assertTrue(evenPage.isLoginDisplayed());
  }
}
