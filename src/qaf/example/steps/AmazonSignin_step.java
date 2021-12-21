package qaf.example.steps;

import org.openqa.selenium.remote.RemoteWebElement;
import static com.qmetry.qaf.automation.step.CommonStep.mouseOver;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class AmazonSignin_step  {

	
	@QAFTestStep(description = "mouse move on {signIn}")
	public static void mouseOver(String signIn) {
		new WebDriverTestBase().getDriver().getMouse().mouseMove(((QAFExtendedWebElement) $(signIn)).getCoordinates());
	}
	

	@QAFTestStep(description = "click on {signInButton}")
	public static void click(String signInButton) {
		$(signInButton).click();
	}
	
	private static RemoteWebElement $(String signInButton) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@QAFTestStep(description = "sendKeys {senthil.7584@gmail.com} into {email}")
	public static void sendKeys(String text, String email) {
		$(email).sendKeys("senthil.7584@gmail.com");
	}
	
	@And("^click on continue$")
	@QAFTestStep(description = "click on {continue}")
	public static void click1(String continuebutton) {
		$(continuebutton).click();
	}

    @And("^ verify text$")
	@QAFTestStep(description = "get text of {textSignin}")
	public static String getText(String textSignin) {
		return $(textSignin).getText();
	}
	
    @And("^enter the password$")
	@QAFTestStep(description = "sendKeys {blackg0d} into {pwd}")
	public static void sendKeys1(String text, String pwd) {
		$(pwd).sendKeys("blackg0d");
	}
}


