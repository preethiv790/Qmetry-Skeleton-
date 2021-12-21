package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.*;


import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonTest extends WebDriverTestCase {
	
	@Test
	public void testCreateNewAcc() {
		get("https://www.amazon.com");
		mouseOver("signIn");
		click("signInButton");
		
		sendKeys("senthil.7584@gmail.com","email");
		click("continue");
		//getText("textSignin");
		sendKeys("blackg0d","pwd");
	
	}

	

	}
