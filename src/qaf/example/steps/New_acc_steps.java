package qaf.example.steps;

import org.openqa.selenium.remote.RemoteWebElement;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_acc_steps {
	
	@When("^ mouseover on sigin $")
	@QAFTestStep(description = "mouse move on {signIn}")
	public static void mouseOver(String signIn) {
		new WebDriverTestBase().getDriver().getMouse().mouseMove(((QAFExtendedWebElement) $(signIn)).getCoordinates());
	}
	
	@Then("^click on signin$")
	@QAFTestStep(description = "click on {signInButton}")
	public static void click(String signInButton) {
		$(signInButton).click();
	}
	
	private static RemoteWebElement $(String signInButton) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Then("^click on createNewacc$")
	@QAFTestStep(description = "click on {createNewAcc}")
	public static void click1(String createNewAcc) {
		$(createNewAcc).click();
	}
	
	
    
	
	

}
