package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HasElementsUse {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		//page.navigate("https://www.orangehrm.com/en/30-day-free-trial/");
		
		//Locator loc = page.locator("select#Form_getForm_Country:has(option[value='India'])");
		
		//loc.allInnerTexts().forEach(s -> System.out.println(s));
		
		page.navigate("https://www.flipkart.com/");
		
		Locator loc = page.locator("div._1ZMrY_:has(a[href='https://corporate.flipkart.net/corporate-home'])");
		loc.allInnerTexts().forEach(s -> System.out.println(s));

		
		
	}

}
