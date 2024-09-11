package playwright.basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelectors {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//locators
		
		BrowserContext browserContext = browser.newContext();
		Page page = browserContext.newPage();
		//page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		
		//To click Single text element present on the webpage
		//page.navigate("https://www.flickr.com/");
		//page.locator("text=Log In").click();
		
		
//		Locator allLinks=page.locator("text=Privacy Policy");
//		for(int i=0; i<allLinks.count();i++) {
//			
//		String text = allLinks.nth(i).textContent();
//		if(text.contains("Service Privacy Policy")) {
//			allLinks.nth(i).click();
//			break;
//		}
			
//		}
		
		page.navigate("https://www.opencart.com/index.php?route=account/login");
		
		
		
		
		
	}

}
